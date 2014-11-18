package com.metarnet.sfpw.hwswitch.mgr;

import java.util.Properties;

import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.Session;
import javax.jms.TextMessage;
import javax.jms.Topic;
import javax.jms.TopicSession;
import javax.jms.TopicSubscriber;
import javax.naming.Context;
import javax.naming.InitialContext;

/**
 * <br>
 * 接收故障主题通知，并打印通知内容.
 * @since 2010-10-12 声明：此代码是通知接收的举例说明，仅供参考
 */

public class Notification implements MessageListener
{
    /**
     * 连接成功的标志
     */
    private static final int CONNECT_SUCCESSFUL = 0;

    /**
     * 连接失败的标志
     */
    private static final int CONNECT_FAIL = 1;

    /**
     * 设置连接的JMS服务器地址
     */

    protected static final String serverIP = "10.78.219.143";

    /**
     * JMS服务器的端口号
     */

    protected static final String serverPort = "61616";

    /**
     * 认证的用户名
     */
    protected static final String userName = "admin";

    /**
     * 认证密码
     */
    protected static final String password = "test1234";

    /**
     * Client ID,可以是缺省值.
     */

    protected String CLIENT_ID = "default-clientID-3";

    protected Properties prop = new Properties();

    /**
     * JNDI Context
     */
    protected Context context = null;

    protected ConnectionFactory factory = null;

    /**
     * 创建的连接
     */

    protected Connection connection = null;

    /**
     *创建的会话
     */

    protected Session session = null;

    /**
     * 按照主题进行通知订阅
     */

    protected TopicSubscriber subscriber = null;

    /**
     * 是否为持久，如果是持久订阅则客户端退出时，通知仍然会保存在JMS服务器上
     */

    protected boolean isDurable = false;

    public static void main(String[] args)
    {
        int result = new Notification().receive();
        System.out.println("\n" + result);

    }

    public int receive()
    {

        try
        {

            prop.put("java.naming.factory.initial", "org.apache.activemq.jndi.ActiveMQInitialContextFactory");
            prop.put("java.naming.provider.url", "tcp://" + serverIP + ":" + serverPort);
            prop.put("topic.Fault", "Fault");
          
            /** 初始化JNDI Context */
            context = new InitialContext(prop);
            factory = (ConnectionFactory) context.lookup("ConnectionFactory");
            /** 创建JMS连接 */
            connection = factory.createConnection(userName, password);

            connection.setClientID(CLIENT_ID);
           

            /** 创建JMS会话 */
            session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);

            String topicName = "Fault";

            Topic topic = (Topic) context.lookup(topicName);
            String strJMSType = "MTOSI_perceivedSeverity = 'CRITICAL'";

            /** 执行订阅 */
            if (isDurable)
                subscriber = session.createDurableSubscriber(topic, topicName, strJMSType, true);
            else
                subscriber = ((TopicSession) session).createSubscriber(topic);

             /** 设置监听 */
            subscriber.setMessageListener(this);

            connection.start();
        }
        catch (Exception e)
        {
            close();
            e.printStackTrace();
            return CONNECT_FAIL;
        }

        return CONNECT_SUCCESSFUL;

    }

    /**
     * <br>
     * 此方法在程序退出时关闭打开的资源
     * @see
     * @since
     * @param void
     * @return void
     */
    public void close()
    {
        try
        {
            if (isDurable)
                session.unsubscribe(CLIENT_ID);

            if (subscriber != null)
                subscriber.close();
            if (session != null)
                session.close();
            if (connection != null)
                connection.close();
        }
        catch (JMSException e)
        {
            System.out.println("Exception occured when close");
            e.printStackTrace();
        }
    }

    /**
     * <br>
     * 消息响应函数
     * @see
     * @since
     * @param message
     * @return void
     */
    public void onMessage(Message message)
    {
        if (message instanceof TextMessage)
            try
            {
                String text = ((TextMessage) message).getText();
                System.out.println(text);

            }
            catch (JMSException e)
            {
                e.printStackTrace();
            }
    }

}