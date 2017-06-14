package com.microsoft.azure.documentdb.sample.dao;

import com.microsoft.azure.documentdb.ConnectionPolicy;
import com.microsoft.azure.documentdb.ConsistencyLevel;
import com.microsoft.azure.documentdb.DocumentClient;

public class DocumentClientFactory {
    
    private static final String HOST = "https://aacomosdb.documents.azure.com:443/";
    private static final String MASTER_KEY = "VlGZRbeGvnrcJVK5shbpaRTiFl6k3HwMYYbojYO4FE5G0IU7VcnlFPRUxrSM4hKFLXsKnjsHFj0s2tvveViaaw==";

    private static DocumentClient documentClient = new DocumentClient(HOST, MASTER_KEY,
            ConnectionPolicy.GetDefault(), ConsistencyLevel.Session);

    public static DocumentClient getDocumentClient() {
        return documentClient;
    }

}
