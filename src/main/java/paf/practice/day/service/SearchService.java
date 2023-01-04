package paf.practice.day.service;

import java.util.LinkedList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Service;

import paf.practice.day.model.Search;
import paf.practice.day.repository.SearchRepository;

@Service
public class SearchService {

    @Autowired
    private SearchRepository repo;



    public List<Search> getbooks(String bookname, int limit){

        SqlRowSet rs = repo.getBooks(bookname, limit);
        final List<Search> results = new LinkedList<>();
    
            while(rs.next()){
                results.add(create(rs));
            }
            return results;
    }
        
    public static Search create(SqlRowSet rs) {
        final Search b = new Search();
        b.setBookId(rs.getString("book_id"));
        b.setTitle(rs.getString("title"));
        b.setDescription(rs.getString("description"));
        b.setRating(rs.getFloat("rating"));
        b.setImage(rs.getString("image_url"));
        return b;
    }
}
