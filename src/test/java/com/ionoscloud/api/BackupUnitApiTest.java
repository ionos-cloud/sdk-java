/*
 * CLOUD API
 * An enterprise-grade Infrastructure is provided as a Service (IaaS) solution that can be managed through a browser-based \"Data Center Designer\" (DCD) tool or via an easy to use API.   The API allows you to perform a variety of management tasks such as spinning up additional servers, adding volumes, adjusting networking, and so forth. It is designed to allow users to leverage the same power and flexibility found within the DCD visual tool. Both tools are consistent with their concepts and lend well to making the experience smooth and intuitive.
 *
 * The version of the OpenAPI document: 5.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.ionoscloud.api;

import com.ionoscloud.ApiException;
import com.ionoscloud.model.BackupUnit;
import com.ionoscloud.model.BackupUnitProperties;
import com.ionoscloud.model.BackupUnitSSO;
import com.ionoscloud.model.BackupUnits;
import com.ionoscloud.model.Error;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for BackupUnitApi
 */
@Ignore
public class BackupUnitApiTest {

    private final BackupUnitApi api = new BackupUnitApi();

    
    /**
     * Delete a Backup Unit
     *
     * NOTE: Running through the deletion process will delete: - the backup plans inside the Backup Unit. - all backups associated with the Backup Unit. - the backup user and finally also the unit
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void backupunitsDeleteTest() throws ApiException {
        String backupunitId = null;
        Boolean pretty = null;
        Integer depth = null;
        Integer xContractNumber = null;
        Object response = api.backupunitsDelete(backupunitId, pretty, depth, xContractNumber);

        // TODO: test validations
    }
    
    /**
     * Returns the specified backup Unit
     *
     * You can retrieve the details of an specific backup unit.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void backupunitsFindByIdTest() throws ApiException {
        String backupunitId = null;
        Boolean pretty = null;
        Integer depth = null;
        Integer xContractNumber = null;
        BackupUnit response = api.backupunitsFindById(backupunitId, pretty, depth, xContractNumber);

        // TODO: test validations
    }
    
    /**
     * List Backup Units 
     *
     * You can retrieve a complete list of backup Units that you have access to.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void backupunitsGetTest() throws ApiException {
        Boolean pretty = null;
        Integer depth = null;
        Integer xContractNumber = null;
        BackupUnits response = api.backupunitsGet(pretty, depth, xContractNumber);

        // TODO: test validations
    }
    
    /**
     * Partially modify a Backup Unit
     *
     * You can use update a backup Unit properties
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void backupunitsPatchTest() throws ApiException {
        String backupunitId = null;
        BackupUnitProperties backupUnitProperties = null;
        Boolean pretty = null;
        Integer depth = null;
        Integer xContractNumber = null;
        BackupUnit response = api.backupunitsPatch(backupunitId, backupUnitProperties, pretty, depth, xContractNumber);

        // TODO: test validations
    }
    
    /**
     * Create a Backup Unit
     *
     * Create a Backup Unit. A Backup Unit is considered a resource like a virtual datacenter, IP Block, snapshot, etc. It shall be shareable via groups inside our User Management Feature 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void backupunitsPostTest() throws ApiException {
        BackupUnit backupUnit = null;
        Boolean pretty = null;
        Integer depth = null;
        Integer xContractNumber = null;
        BackupUnit response = api.backupunitsPost(backupUnit, pretty, depth, xContractNumber);

        // TODO: test validations
    }
    
    /**
     * Modify a Backup Unit
     *
     * You can use update a backup Unit properties
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void backupunitsPutTest() throws ApiException {
        String backupunitId = null;
        BackupUnit backupUnit = null;
        Boolean pretty = null;
        Integer depth = null;
        Integer xContractNumber = null;
        BackupUnit response = api.backupunitsPut(backupunitId, backupUnit, pretty, depth, xContractNumber);

        // TODO: test validations
    }
    
    /**
     * Returns a single signon URL for the specified backup Unit.
     *
     * Returns a single signon URL for the specified backup Unit.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void backupunitsSsourlGetTest() throws ApiException {
        String backupunitId = null;
        Boolean pretty = null;
        Integer xContractNumber = null;
        BackupUnitSSO response = api.backupunitsSsourlGet(backupunitId, pretty, xContractNumber);

        // TODO: test validations
    }
    
}
