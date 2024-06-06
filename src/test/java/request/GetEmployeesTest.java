package request;

import objects.Employee;
import objects.Employees;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.testng.Assert.*;

public class GetEmployeesTest extends RequestBase {

    private final String path = "/employees";

    @Test
    public void getEmployees() {
        Employees employeesResponse =
                given()
                        .spec(request)
                .when()
                        .get(path)
                .then()
                        .statusCode(200)
                        .extract().as(Employees.class);

        assertEquals(employeesResponse.getData().size(), 24);

        for(Employee employee : employeesResponse.getData()) {
            if(employee.getEmployee_salary() == 313500) {
                assertEquals(employee.getEmployee_name(), "Haley Kennedy");
            }
        }
    }
}
