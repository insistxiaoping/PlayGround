

import com.td.pm.bean.Users;
import com.td.pm.mapper.EquipmentsMapper;
import com.td.pm.mapper.UsersMapper;
import com.td.pm.service.UsersService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:applicationContext.xml","classpath:springMVC.xml"})
public class UserMapperTest {
	@Autowired
	private UsersService service;
    @Autowired
    private EquipmentsMapper mapper;
	@Autowired
	private Users users;
	@Test
	public void test() {
	    List<String> list = new ArrayList<>();
	    list.add("pppai");
	    list.add("ppqiu");
        mapper.deleteByPrimaryKeys(list);
		System.out.println();
	}

//	@Test
//	public void test1() {
//		users.setUserPassword("123");
//		users.setUserId("123");
//        List<Users> users = service.queryAll();
//		System.out.println();
//	}
}
