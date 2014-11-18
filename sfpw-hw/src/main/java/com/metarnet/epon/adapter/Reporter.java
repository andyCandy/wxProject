package com.metarnet.epon.adapter;

import com.metarnet.common.RunStatus;

public abstract interface Reporter
{
  public abstract void status(RunStatus paramRunStatus);

  public abstract RunStatus status();

  public abstract String getSystemTime();

  public abstract boolean raiseAlarm(Alarm paramAlarm);

  public abstract boolean clearAlarm(String paramString1, String paramString2);

  public abstract boolean raiseOltPerformance(OltPerformance paramOltPerformance);

  public abstract boolean raiseIfPerformance(IfPerformance paramIfPerformance);
}

/* Location:           C:\Users\bcmeng\Desktop\epon.jar
 * Qualified Name:     com.metarnet.epon.adapter.Reporter
 * JD-Core Version:    0.6.0
 */