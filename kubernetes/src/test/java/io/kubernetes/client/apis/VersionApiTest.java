/*
 * Kubernetes
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v1.6.3
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.kubernetes.client.apis;

import io.kubernetes.client.ApiException;
import io.kubernetes.client.models.VersionInfo;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for VersionApi
 */
@Ignore
public class VersionApiTest {

    private final VersionApi api = new VersionApi();

    
    /**
     * 
     *
     * get the code version
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCodeTest() throws ApiException {
        VersionInfo response = api.getCode();

        // TODO: test validations
    }
    
}
