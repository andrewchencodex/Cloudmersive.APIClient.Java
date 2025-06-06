# CompareDocumentApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**compareDocumentDoc**](CompareDocumentApi.md#compareDocumentDoc) | **POST** /convert/compare/doc | Compare Two Word DOC (Legacy 97-2003 Format)
[**compareDocumentDocx**](CompareDocumentApi.md#compareDocumentDocx) | **POST** /convert/compare/docx | Compare Two Word DOCX


<a name="compareDocumentDoc"></a>
# **compareDocumentDoc**
> byte[] compareDocumentDoc(inputFile1, inputFile2, comparisonMode, autorepair, changeOutlines, headersAndFooters, acceptAllChanges)

Compare Two Word DOC (Legacy 97-2003 Format)

Compare two Office Word Documents (doc) legacy 97-2003 format files and highlight the differences

### Example
```java
// Import classes:
//import com.cloudmersive.client.invoker.ApiClient;
//import com.cloudmersive.client.invoker.ApiException;
//import com.cloudmersive.client.invoker.Configuration;
//import com.cloudmersive.client.invoker.auth.*;
//import com.cloudmersive.client.CompareDocumentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Apikey
ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
Apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Apikey.setApiKeyPrefix("Token");

CompareDocumentApi apiInstance = new CompareDocumentApi();
File inputFile1 = new File("/path/to/file.txt"); // File | First input file to perform the operation on.
File inputFile2 = new File("/path/to/file.txt"); // File | Second input file to perform the operation on (more than 2 can be supplied).
String comparisonMode = "comparisonMode_example"; // String | Optional; set to basic for a basic comparison, and advanced for advanced comparison mode.  Advanced comparison mode requires Managed Instance or Private Cloud deployment.
Boolean autorepair = true; // Boolean | Optional; automatically repair input documents that have errors (default is true)
Boolean changeOutlines = true; // Boolean | Optional; highlight changes with a blue outline (default is true)
Boolean headersAndFooters = true; // Boolean | Optional; include headers and footers (default is false)
Boolean acceptAllChanges = true; // Boolean | Optional; accept all changes before comparison (default is false)
try {
    byte[] result = apiInstance.compareDocumentDoc(inputFile1, inputFile2, comparisonMode, autorepair, changeOutlines, headersAndFooters, acceptAllChanges);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CompareDocumentApi#compareDocumentDoc");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inputFile1** | **File**| First input file to perform the operation on. |
 **inputFile2** | **File**| Second input file to perform the operation on (more than 2 can be supplied). |
 **comparisonMode** | **String**| Optional; set to basic for a basic comparison, and advanced for advanced comparison mode.  Advanced comparison mode requires Managed Instance or Private Cloud deployment. | [optional]
 **autorepair** | **Boolean**| Optional; automatically repair input documents that have errors (default is true) | [optional]
 **changeOutlines** | **Boolean**| Optional; highlight changes with a blue outline (default is true) | [optional]
 **headersAndFooters** | **Boolean**| Optional; include headers and footers (default is false) | [optional]
 **acceptAllChanges** | **Boolean**| Optional; accept all changes before comparison (default is false) | [optional]

### Return type

**byte[]**

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/octet-stream

<a name="compareDocumentDocx"></a>
# **compareDocumentDocx**
> byte[] compareDocumentDocx(inputFile1, inputFile2, comparisonMode, autorepair, changeOutlines, headersAndFooters, acceptAllChanges)

Compare Two Word DOCX

Compare two Office Word Documents (docx) files and highlight the differences

### Example
```java
// Import classes:
//import com.cloudmersive.client.invoker.ApiClient;
//import com.cloudmersive.client.invoker.ApiException;
//import com.cloudmersive.client.invoker.Configuration;
//import com.cloudmersive.client.invoker.auth.*;
//import com.cloudmersive.client.CompareDocumentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Apikey
ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
Apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Apikey.setApiKeyPrefix("Token");

CompareDocumentApi apiInstance = new CompareDocumentApi();
File inputFile1 = new File("/path/to/file.txt"); // File | First input file to perform the operation on.
File inputFile2 = new File("/path/to/file.txt"); // File | Second input file to perform the operation on (more than 2 can be supplied).
String comparisonMode = "comparisonMode_example"; // String | Optional; set to basic for a basic comparison, and advanced for advanced comparison mode.  Advanced comparison mode requires Managed Instance or Private Cloud deployment.
Boolean autorepair = true; // Boolean | Optional; automatically repair input documents that have errors (default is true)
Boolean changeOutlines = true; // Boolean | Optional; highlight changes with a blue outline (default is true)
Boolean headersAndFooters = true; // Boolean | Optional; include headers and footers (default is false)
Boolean acceptAllChanges = true; // Boolean | Optional; accept all changes before comparison (default is false)
try {
    byte[] result = apiInstance.compareDocumentDocx(inputFile1, inputFile2, comparisonMode, autorepair, changeOutlines, headersAndFooters, acceptAllChanges);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CompareDocumentApi#compareDocumentDocx");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inputFile1** | **File**| First input file to perform the operation on. |
 **inputFile2** | **File**| Second input file to perform the operation on (more than 2 can be supplied). |
 **comparisonMode** | **String**| Optional; set to basic for a basic comparison, and advanced for advanced comparison mode.  Advanced comparison mode requires Managed Instance or Private Cloud deployment. | [optional]
 **autorepair** | **Boolean**| Optional; automatically repair input documents that have errors (default is true) | [optional]
 **changeOutlines** | **Boolean**| Optional; highlight changes with a blue outline (default is true) | [optional]
 **headersAndFooters** | **Boolean**| Optional; include headers and footers (default is false) | [optional]
 **acceptAllChanges** | **Boolean**| Optional; accept all changes before comparison (default is false) | [optional]

### Return type

**byte[]**

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/octet-stream

