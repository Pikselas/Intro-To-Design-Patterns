public class URLBuilder 
{
	private String schema;
	private String hostname;
	private String port;
	private String pathParam;
	private String queryParamName;
	private String queryParamValue;

	private URLBuilder(Builder builder) 
	{
		this.schema = builder.schema;
		this.hostname = builder.hostname;
		this.port = builder.port;
		this.pathParam = builder.pathParam;
		this.queryParamName = builder.queryParamName;
		this.queryParamValue = builder.queryParamValue;
	}

	public static class Builder
	{
		private String schema;
		private String hostname;
		private String port;
		private String pathParam;
		private String queryParamName;
		private String queryParamValue;

		public Builder schema(String schema) 
		{
			this.schema = schema;
			return this;
		}

		public Builder hostname(String hostname) 
		{
			this.hostname = hostname;
			return this;
		}

		public Builder port(String port) 
		{
			this.port = port;
			return this;
		}

		public Builder pathParam(String pathParam) 
		{
			this.pathParam = pathParam;
			return this;
		}

		public Builder queryParam(String queryParamName, String queryParamValue) 
		{
			this.queryParamName = queryParamName;
			this.queryParamValue = queryParamValue;
			return this;
		}

		public URLBuilder build() {
			return new URLBuilder(this);
		}
	}

	public String buildUrl() {
		StringBuilder urlBuilder = new StringBuilder();
	
		/*
		 * schema and hostname are mandatory field
		 */

		urlBuilder.append(schema).append("://");
	
		urlBuilder.append(hostname);

		/*
		 * port, path param are query param are optional
		*/
		if (port != null) 
		{
			urlBuilder.append(":").append(port);
		}
	
		if (pathParam != null) 
		{
			urlBuilder.append("/").append(pathParam);
		}
	
		if (queryParamName != null && queryParamValue != null) {
				
			urlBuilder.append("&");
			urlBuilder.append(queryParamName).append("=").append(queryParamValue);
		}
	
		return urlBuilder.toString();
	}	
}