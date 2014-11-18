package com.metarnet.epon.adapter;

import com.metarnet.message.AddEquipmentRequest;
import com.metarnet.message.DelEquipmentRequest;
import java.util.List;

public abstract interface Adapter
{
  public abstract void setReporter(Reporter paramReporter);

  public abstract OLT getOLT(String paramString)
    throws AdapterException;

  public abstract List<OLT> getAllOLTs()
    throws AdapterException;

  public abstract List<Interface> getAllInterfaces(String paramString)
    throws AdapterException;

  public abstract List<Splitter> getAllSplitters(String paramString)
    throws AdapterException;

  public abstract List<ONU> getAllONUs(String paramString)
    throws AdapterException;

  public abstract List<UNI> getAllUNIs(String paramString)
    throws AdapterException;

  public abstract List<Alarm> getAllActiveAlarms()
    throws AdapterException;

  public abstract List<Alarm> getAllActiveAlarms(String paramString)
    throws AdapterException;

  public abstract boolean addEquipment(AddEquipmentRequest paramAddEquipmentRequest);

  public abstract boolean delEquipment(DelEquipmentRequest paramDelEquipmentRequest);
}

/* Location:           C:\Users\bcmeng\Desktop\epon.jar
 * Qualified Name:     com.metarnet.epon.adapter.Adapter
 * JD-Core Version:    0.6.0
 */