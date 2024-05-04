package joaopepe10.com.github.controller;

import io.micronaut.http.annotation.Controller;
import jakarta.validation.Valid;
import joaopepe10.com.github.BookApi;
import joaopepe10.com.github.model.BookRequest;
import joaopepe10.com.github.model.BookResponse;

import java.time.ZonedDateTime;
import java.util.List;
import java.util.UUID;

@Controller("/books")
public class BookController implements BookApi {

    @Override
    public BookResponse createBook(BookRequest bookRequest) {
        var response = new BookResponse();
        response.createdAt(ZonedDateTime.now());
        response.author(bookRequest.getAuthor());
        response.id(String.valueOf(UUID.randomUUID()));
        response.title(bookRequest.getTitle());
        response.setStatus(bookRequest.getStatus());
        return response;
    }

    @Override
    public void deleteBook(String id) {

    }

    @Override
    public BookResponse getBookById(String id) {
        return null;
    }

    @Override
    public List<@Valid BookResponse> listAllBooks() {
        return null;
    }

    @Override
    public BookResponse updateBook(String id, BookRequest bookRequest) {
        return null;
    }
}
