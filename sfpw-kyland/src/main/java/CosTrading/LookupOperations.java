package CosTrading;

/**
 *	Generated from IDL interface "Lookup"
 *	@author JacORB IDL compiler V 2.2.2, 1-Jun-2005
 */


public interface LookupOperations
	extends org.omg.CosTrading.TraderComponentsOperations , org.omg.CosTrading.SupportAttributesOperations , org.omg.CosTrading.ImportAttributesOperations
{
	/* constants */
	/* operations  */
	void query(java.lang.String type, java.lang.String constr, java.lang.String pref, org.omg.CosTrading.Policy[] policies, org.omg.CosTrading.LookupPackage.SpecifiedProps desired_props, int how_many, org.omg.CosTrading.OfferSeqHolder offers, org.omg.CosTrading.OfferIteratorHolder offer_iter, org.omg.CosTrading.PolicyNameSeqHolder limits_applied) throws org.omg.CosTrading.LookupPackage.IllegalPreference,org.omg.CosTrading.DuplicatePropertyName,org.omg.CosTrading.LookupPackage.InvalidPolicyValue,org.omg.CosTrading.IllegalServiceType,org.omg.CosTrading.LookupPackage.PolicyTypeMismatch,org.omg.CosTrading.IllegalConstraint,org.omg.CosTrading.LookupPackage.IllegalPolicyName,org.omg.CosTrading.DuplicatePolicyName,org.omg.CosTrading.IllegalPropertyName,org.omg.CosTrading.UnknownServiceType;
}
