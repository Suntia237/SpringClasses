package cn.edu.xync.mapper;

import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @Description:
 * @Author: GeMeng
 * @Date: 2026/11/9 14:10
 */
@Component
public class DataDI {
    private String[] array;
    private List<String> list;
    private Set<String> set;
    private Map<Integer, String> map;
    private Map<String, String> properties;

    public void setArray(String[] array) {
        this.array = array;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public void setSet(Set<String> set) {
        this.set = set;
    }

    public void setMap(Map<Integer, String> map) {
        this.map = map;
    }

    public void setProperties(Map<String, String> properties) {
        this.properties = properties;
    }

    public void show() {
        System.out.print("Array:");
        for (String s : array) {
            System.out.print(s + " ");
        }
        System.out.println("list:" + list);
        System.out.println("set:" + set);
        System.out.println("map:" + map);
        System.out.println("properties:" + properties);
    }
}
