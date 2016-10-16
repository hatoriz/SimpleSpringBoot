package readinglist;

/**
 * Created by nidchaya on 10/16/2016.
 */
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface ReadingListRepository extends JpaRepository<Book, Long> {

    List<Book> findByReader(String reader);

}
