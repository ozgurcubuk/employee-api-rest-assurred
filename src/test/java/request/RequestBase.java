package request;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;

 class RequestBase {
     RequestSpecification request = new RequestSpecBuilder()
             .addHeader("Content-Type", "application/json")
             .setBaseUri("https://dummy.restapiexample.com/api/v1")
             .build();
}
