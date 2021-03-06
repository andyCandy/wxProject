package CosTrading;

import org.omg.PortableServer.POA;

/**
 *	Generated from IDL interface "OfferIterator"
 *	@author JacORB IDL compiler V 2.2.2, 1-Jun-2005
 */

public class OfferIteratorPOATie
	extends OfferIteratorPOA
{
	private OfferIteratorOperations _delegate;

	private POA _poa;
	public OfferIteratorPOATie(OfferIteratorOperations delegate)
	{
		_delegate = delegate;
	}
	public OfferIteratorPOATie(OfferIteratorOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.omg.CosTrading.OfferIterator _this()
	{
		return org.omg.CosTrading.OfferIteratorHelper.narrow(_this_object());
	}
	public org.omg.CosTrading.OfferIterator _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.CosTrading.OfferIteratorHelper.narrow(_this_object(orb));
	}
	public OfferIteratorOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(OfferIteratorOperations delegate)
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
	public int max_left() throws org.omg.CosTrading.UnknownMaxLeft
	{
		return _delegate.max_left();
	}

	public void destroy()
	{
_delegate.destroy();
	}

	public boolean next_n(int n, org.omg.CosTrading.OfferSeqHolder offers)
	{
		return _delegate.next_n(n,offers);
	}

}
