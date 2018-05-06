package demo.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import demo.dao.DemoMapper;
import demo.pojo.Demo;
import demo.service.IDemoService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@Service
public class DemoService implements IDemoService {

    @Autowired
    DemoMapper demoMapper;

    public PageInfo getDemo(){
        PageHelper.startPage(1,3);
        if(demoMapper==null){
            System.out.println("null");
        }
        List<Demo> demoList=demoMapper.getDemo("12");
        PageInfo<Demo> result=new PageInfo<>(demoList);
        return result;
    }
}
