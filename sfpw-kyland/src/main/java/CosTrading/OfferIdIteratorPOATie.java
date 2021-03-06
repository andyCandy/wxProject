package CosTrading;

import org.omg.PortableServer.POA;

/**
 *	Generated from IDL interface "OfferIdIterator"
 *	@author JacORB IDL compiler V 2.2.2, 1-Jun-2005
 */

public class OfferIdIteratorPOATie
	extends OfferIdIteratorPOA
{
	private OfferIdIteratorOperations _delegate;

	private POA _poa;
	public OfferIdIteratorPOATie(OfferIdIteratorOperations delegate)
	{
		_delegate = delegate;
	}
	public OfferIdIteratorPOATie(OfferIdIteratorOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.omg.CosTrading.OfferIdIterator _this()
	{
		return org.omg.CosTrading.OfferIdIteratorHelper.narrow(_this_object());
	}
	public org.omg.CosTrading.OfferIdIterator _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.CosTrading.OfferIdIteratorHelper.narrow(_this_object(orb));
	}
	public OfferIdIteratorOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(OfferIdIteratorOperations delegate)
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
	public boolean next_n(int n, org.omg.CosTrading.OfferIdSeqHolder ids)
	{
		return _delegate.next_n(n,ids);
	}

	public int max_left() throws org.omg.CosTrading.UnknownMaxLeft
	{
		return _delegate.max_left();
	}

	public void destroy()
	{
_delegate.destroy();
	}

}
