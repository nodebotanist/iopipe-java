package com.iopipe;

import com.iopipe.http.RemoteRequest;
import com.iopipe.http.RequestType;

/**
 * This contains the request information.
 *
 * @since 2018/02/24
 */
public final class WrappedRequest
{
	/** The URL. */
	public final String url;
	
	/** The authorization token. */
	public final String authtoken;
	
	/** The request type. */
	public final RequestType type;
	
	/** The request being made. */
	public final RemoteRequest request;
	
	/**
	 * Initializes the wrapped request.
	 *
	 * @param __u The URL.
	 * @param __a The authorization token.
	 * @param __t The type of request.
	 * @param __r The request being made.
	 * @since 2018/02/24
	 */
	public WrappedRequest(String __u, String __a, RequestType __t,
		RemoteRequest __r)
	{
		this.url = __u;
		this.authtoken = __a;
		this.type = __t;
		this.request = __r;
	}
}

