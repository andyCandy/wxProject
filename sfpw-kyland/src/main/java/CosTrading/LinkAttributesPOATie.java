package CosTrading;

import org.omg.PortableServer.POA;

/**
 *	Generated from IDL interface "LinkAttributes"
 *	@author JacORB IDL compiler V 2.2.2, 1-Jun-2005
 */

public class LinkAttributesPOATie
	extends LinkAttributesPOA
{
	private LinkAttributesOperations _delegate;

	private POA _poa;
	public LinkAttributesPOATie(LinkAttributesOperations delegate)
	{
		_delegate = delegate;
	}
	public LinkAttributesPOATie(LinkAttributesOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.omg.CosTrading.LinkAttributes _this()
	{
		return org.omg.CosTrading.LinkAttributesHelper.narrow(_this_object());
	}
	public org.omg.CosTrading.LinkAttributes _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.CosTrading.LinkAttributesHelper.narrow(_this_object(orb));
	}
	public LinkAttributesOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(LinkAttributesOperations delegate)
	{
		_delegate = delegate;
	}
	public POA _default_POA()
	{
		if (_poa != null)
		{
			return _poa;
		}
		else
		{
			return super._default_POA();
		}
	}
	public org.omg.CosTrading.FollowOption max_link_follow_policy()
	{
		return _delegate.max_link_follow_policy();
	}

}
