package com.wyn.info.dao;
import com.wyn.info.model.WynUser;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface WynUserDao {
    List<WynUser> findAll();
}
