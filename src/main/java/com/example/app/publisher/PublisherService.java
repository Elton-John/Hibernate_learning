package com.example.app.publisher;

import com.example.app.book.Book;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class PublisherService {

    private final PublisherDao publisherDao;

    public Publisher add() {
        Publisher publisher = new Publisher();
        publisher.setName("wydawnictwo");
        publisherDao.savePublisher(publisher);
        return publisher;
    }

    public Publisher findById(Long id) {
        return publisherDao.findById(id);
    }

    public Publisher update(Long id, String name) {
        Publisher publisher = publisherDao.findById(id);
        publisher.setName(name);
        publisherDao.update(publisher);
        return publisher;
    }

    public void delete(Long id) {
        Publisher publisher = publisherDao.findById(id);
        publisherDao.delete(publisher);
    }
}
