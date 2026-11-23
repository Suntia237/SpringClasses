package cn.edu.xync.service.Impl;
import cn.edu.xync.mapper.TransferMapper;
import cn.edu.xync.service.TransferService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TransferServiceImpl implements TransferService {
    @Autowired
    TransferMapper transferMapper;

    @Override
    public void transfer(String out, String in, Integer money) {
        transferMapper.outMoney(out, money);
        transferMapper.inMoney(in, money);
    }
}
