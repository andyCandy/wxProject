package com.metarnet.epon.input;

import com.metarnet.common.RunStatus;
import java.util.List;

public abstract interface InputDatabase
{
  public abstract InputOLT getOLT(String paramString)
    throws InputException;

  public abstract List<InputOLT> getAllOLTs()
    throws InputException;

  public abstract List<InputInterface> getAllInterfaces(String paramString)
    throws InputException;

  public abstract List<InputSplitter> getAllSplitters(String paramString)
    throws InputException;

  public abstract List<InputONU> getAllONUs(String paramString)
    throws InputException;

  public abstract List<InputUNI> getAllUNIs(String paramString)
    throws InputException;

  public abstract boolean startSyncTask(String paramString);

  public abstract boolean finishSyncTask(String paramString1, boolean paramBoolean, String paramString2);

  public abstract boolean clearSyncOLT(String paramString);

  public abstract boolean finishSyncOLT(String paramString1, String paramString2, boolean paramBoolean, String paramString3);

  public abstract boolean addCorrect(InputCorrect paramInputCorrect);

  public abstract boolean clearAllCorrects();

  public abstract boolean clearAllCorrects(String paramString);

  public abstract List<String> getAllActiveAlarmIds();

  public abstract List<String> getAllActiveAlarmIds(String paramString);

  public abstract InputResult raiseAlarm(InputAlarm paramInputAlarm);

  public abstract InputResult clearAlarm(String paramString);

  public abstract InputResult clearAlarm(String paramString1, String paramString2);

  public abstract boolean updateRunStatus(RunStatus paramRunStatus);

  public abstract String getSystemTime();

  public abstract InputResult raiseIfPerformance(InputIfPerformance paramInputIfPerformance);

  public abstract InputResult raiseOltPerformance(InputOltPerformance paramInputOltPerformance);

  public abstract boolean addInterface(InputInterface paramInputInterface);

  public abstract boolean updateInterface(InputInterface paramInputInterface);

  public abstract boolean removeInterface(String paramString1, String paramString2);

  public abstract boolean addUNI(InputUNI paramInputUNI);

  public abstract boolean updateUNI(InputUNI paramInputUNI);

  public abstract boolean removeUNI(String paramString1, String paramString2, String paramString3);

  public abstract boolean addONU(InputONU paramInputONU);

  public abstract boolean updateONU(InputONU paramInputONU);

  public abstract boolean removeONU(String paramString1, String paramString2);

  public abstract boolean addOLT(InputOLT paramInputOLT);

  public abstract boolean delOLT(String paramString);

  public abstract boolean modifyOLT(InputOLT paramInputOLT);
}

/* Location:           C:\Users\bcmeng\Desktop\epon.jar
 * Qualified Name:     com.metarnet.epon.input.InputDatabase
 * JD-Core Version:    0.6.0
 */