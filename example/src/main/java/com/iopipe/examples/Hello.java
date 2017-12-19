package com.iopipe.examples;

import com.amazonaws.services.lambda.runtime.Context;
import com.iopipe.SimpleRequestHandlerWrapper;

/**
 * This class wraps the simple request handler and just prefixes "Hello" to
 * any given input string.
 *
 * @since 2017/12/18
 */
public class Hello
	extends SimpleRequestHandlerWrapper<String, String>
{
	/**
	 * {@inheritDoc}
	 * @since 2017/12/13
	 */
	@Override
	protected final String wrappedHandleRequest(String __input, Context __c)
	{
		__c.getLogger().log("Input: " + __input);
		return "Hello " + __input + "!";
	}
}
