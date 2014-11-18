package com.metarnet.sfpw.hw.entity.pm;

/**
 * 光模块信息
 * 
 * @author Administrator
 * @version 
 * @see com.module.adapter.zte.entity.pm
 * @since
 */
public class OmDdm
{
    /*List of Optical Power Info
    -----------------------------------------------------
    ONUID   RxPower RxPowerR    TxPower TxPowerR    CurrTxBias  CurrTxBiasR Temperature TemperatureR    Voltage VoltageR    PTxPower    PRxPower
    --  --  --  4.234   Normal  35.5    Normal  35.04   Normal  3.263   Normal  --  --*/
    private String onuId;
    private float rxPower;//接收光功率
    private String rxPowerR;//接收光功率是否正常
    private float txPower;//发送光功率
    private String txPowerR;//发送光功率是否正常
    private float currTxBias;//偏置电流
    private String currTxBiasR;//偏置电流是否正常
    private float temperature;//温度
    private String temperatureR;//温度是否正常
    private float voltage;//电压
    private String voltageR;//电压是否正常
    private float ptxPower;//对端发送光功率
    private float prxPower;//对端接收光功率
    public String getOnuId()
    {
        return onuId;
    }
    public void setOnuId(String onuId)
    {
        this.onuId = onuId;
    }
    public float getRxPower()
    {
        return rxPower;
    }
    public void setRxPower(float rxPower)
    {
        this.rxPower = rxPower;
    }
    public String getRxPowerR()
    {
        return rxPowerR;
    }
    public void setRxPowerR(String rxPowerR)
    {
        this.rxPowerR = rxPowerR;
    }
    public float getTxPower()
    {
        return txPower;
    }
    public void setTxPower(float txPower)
    {
        this.txPower = txPower;
    }
    public String getTxPowerR()
    {
        return txPowerR;
    }
    public void setTxPowerR(String txPowerR)
    {
        this.txPowerR = txPowerR;
    }
    public float getCurrTxBias()
    {
        return currTxBias;
    }
    public void setCurrTxBias(float currTxBias)
    {
        this.currTxBias = currTxBias;
    }
    public String getCurrTxBiasR()
    {
        return currTxBiasR;
    }
    public void setCurrTxBiasR(String currTxBiasR)
    {
        this.currTxBiasR = currTxBiasR;
    }
    public float getTemperature()
    {
        return temperature;
    }
    public void setTemperature(float temperature)
    {
        this.temperature = temperature;
    }
    public String getTemperatureR()
    {
        return temperatureR;
    }
    public void setTemperatureR(String temperatureR)
    {
        this.temperatureR = temperatureR;
    }
    public float getVoltage()
    {
        return voltage;
    }
    public void setVoltage(float voltage)
    {
        this.voltage = voltage;
    }
    public String getVoltageR()
    {
        return voltageR;
    }
    public void setVoltageR(String voltageR)
    {
        this.voltageR = voltageR;
    }
    public float getPtxPower()
    {
        return ptxPower;
    }
    public void setPtxPower(float ptxPower)
    {
        this.ptxPower = ptxPower;
    }
    public float getPrxPower()
    {
        return prxPower;
    }
    public void setPrxPower(float prxPower)
    {
        this.prxPower = prxPower;
    }
}
