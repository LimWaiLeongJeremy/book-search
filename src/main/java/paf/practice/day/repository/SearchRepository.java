package paf.practice.day.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Repository;

import static paf.practice.day.repository.Query.*;

@Repository
public class SearchRepository {
    @Autowired
    private JdbcTemplate jdbc;

    public SqlRowSet getBooks(String bookname, int limit) {
   
        return jdbc.queryForRowSet(SQL_SELECT_BYNAME_LIMIT, "%%%s%%".formatted(bookname), limit);
    }

}
