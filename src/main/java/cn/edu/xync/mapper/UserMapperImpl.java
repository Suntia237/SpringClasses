package cn.edu.xync.mapper;

public class UserMapperImpl implements UserMapper{
    @Override
    public void findAllUsers() {
        System.out.println("findAllUsers");
    }

    @Override
    public void findUserById(int id) {
        System.out.println("findUserByid "+id);
    }
}
