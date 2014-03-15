package com.gazbert.patterns.creational.builder;

import com.gazbert.patterns.creational.builder.customer.Customer;

/**
 * Concrete Director impl for assembling an Investing Customer.
 * <p>
 * The Director decides what builder methods to call and in what order.
 * <p>
 * Tells the Builder what to build and at what point to return what it has built to date.
 * 
 * @author gazbert
 *
 */
public class InvestingCustomerDirector extends AbstractCustomerDirector {

    @Override
    public Customer build(final AbstractCustomerBuilder builder) {
	
	builder.buildContactDetails();
	builder.buildEmployerDetails();
	
	// for investors only
	builder.buildTaxationDetails();
	builder.buildRewardsScheme();
	
	builder.buildSalesOpportunities();
	builder.buildMarketingPreferences();
	
	return builder.getCustomer();
    }
}