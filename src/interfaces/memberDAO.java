package interfaces;


import bookjava.Member;

import java.sql.SQLException;
import java.util.List;

public interface memberDAO  {

    Member getOne(String cin) throws SQLException;

    List<Member> getALL() throws SQLException;

    Member insert(Member member) throws SQLException;

    Member update(Member member) throws SQLException;

    boolean delete(Member member) throws SQLException;
}
