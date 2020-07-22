import com.zdssm.pojo.Employee;
import com.zdssm.service.EmployeeService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author zd
 * @Date 2020/7/22 11:45
 **/
public class TestBean {

    @Test
    public void test(){
        ApplicationContext context =  new ClassPathXmlApplicationContext("applicationContext.xml");
        EmployeeService employeeImp = (EmployeeService) context.getBean("employeeImp");

        for(Employee employee : employeeImp.queryAllEmployee()){
            System.out.println(employee);
        }


    }
}
