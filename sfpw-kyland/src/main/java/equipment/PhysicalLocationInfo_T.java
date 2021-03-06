package equipment;

/**
 *	Generated from IDL definition of union "PhysicalLocationInfo_T"
 *	@author JacORB IDL compiler 
 */

public final class PhysicalLocationInfo_T
	implements org.omg.CORBA.portable.IDLEntity
{
	private equipment.ResourceTypeQualifier_T discriminator;
	private equipment.EquipmentRoom_T equipRoom;
	private equipment.Cabinet_T cabinet;
	private equipment.Shelf_T shelf;

	public PhysicalLocationInfo_T ()
	{
	}

	public equipment.ResourceTypeQualifier_T discriminator ()
	{
		return discriminator;
	}

	public equipment.EquipmentRoom_T equipRoom ()
	{
		if (discriminator != equipment.ResourceTypeQualifier_T.EQTROOM)
			throw new org.omg.CORBA.BAD_OPERATION();
		return equipRoom;
	}

	public void equipRoom (equipment.EquipmentRoom_T _x)
	{
		discriminator = equipment.ResourceTypeQualifier_T.EQTROOM;
		equipRoom = _x;
	}

	public equipment.Cabinet_T cabinet ()
	{
		if (discriminator != equipment.ResourceTypeQualifier_T.CABINET)
			throw new org.omg.CORBA.BAD_OPERATION();
		return cabinet;
	}

	public void cabinet (equipment.Cabinet_T _x)
	{
		discriminator = equipment.ResourceTypeQualifier_T.CABINET;
		cabinet = _x;
	}

	public equipment.Shelf_T shelf ()
	{
		if (discriminator != equipment.ResourceTypeQualifier_T.SHELF)
			throw new org.omg.CORBA.BAD_OPERATION();
		return shelf;
	}

	public void shelf (equipment.Shelf_T _x)
	{
		discriminator = equipment.ResourceTypeQualifier_T.SHELF;
		shelf = _x;
	}

}
