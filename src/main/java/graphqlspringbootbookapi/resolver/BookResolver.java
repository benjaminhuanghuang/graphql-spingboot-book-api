package graphqlspringbootbookapi.resolver;

import com.coxautodev.graphql.tools.GraphQLResolver;
import graphqlspringbootbookapi.model.Author;
import graphqlspringbootbookapi.model.Book;
import graphqlspringbootbookapi.repository.AuthorRepository;

public class BookResolver implements GraphQLResolver<Book> {
    private AuthorRepository authorRepository;

    public BookResolver(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    public Author getAuthor(Book book) {
        return authorRepository.findOne(book.getAuthor().getId());
    }
}
