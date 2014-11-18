package CosTrading;

/**
 *	Generated from IDL interface "Link"
 *	@author JacORB IDL compiler V 2.2.2, 1-Jun-2005
 */


public interface LinkOperations
	extends org.omg.CosTrading.TraderComponentsOperations , org.omg.CosTrading.SupportAttributesOperations , org.omg.CosTrading.LinkAttributesOperations
{
	/* constants */
	/* operations  */
	void add_link(java.lang.String name, org.omg.CosTrading.Lookup target, org.omg.CosTrading.FollowOption def_pass_on_follow_rule, org.omg.CosTrading.FollowOption limiting_follow_rule) throws org.omg.CosTrading.LinkPackage.IllegalLinkName,org.omg.CosTrading.InvalidLookupRef,org.omg.CosTrading.LinkPackage.LimitingFollowTooPermissive,org.omg.CosTrading.LinkPackage.DuplicateLinkName,org.omg.CosTrading.LinkPackage.DefaultFollowTooPermissive;
	void remove_link(java.lang.String name) throws org.omg.CosTrading.LinkPackage.IllegalLinkName,org.omg.CosTrading.LinkPackage.UnknownLinkName;
	org.omg.CosTrading.LinkPackage.LinkInfo describe_link(java.lang.String name) throws org.omg.CosTrading.LinkPackage.IllegalLinkName,org.omg.CosTrading.LinkPackage.UnknownLinkName;
	java.lang.String[] list_links();
	void modify_link(java.lang.String name, org.omg.CosTrading.FollowOption def_pass_on_follow_rule, org.omg.CosTrading.FollowOption limiting_follow_rule) throws org.omg.CosTrading.LinkPackage.IllegalLinkName,org.omg.CosTrading.LinkPackage.LimitingFollowTooPermissive,org.omg.CosTrading.LinkPackage.DefaultFollowTooPermissive,org.omg.CosTrading.LinkPackage.UnknownLinkName;
}
