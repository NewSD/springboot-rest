package com.niu.repo;

import com.niu.entity.Book;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by ami on 2019/6/24.
 */
public interface BookRepositoryMongo extends MongoRepository<Book, Integer> {
}
