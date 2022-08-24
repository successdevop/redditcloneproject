package com.success.reddit;

import com.success.reddit.models.Comment;
import com.success.reddit.models.Link;
import com.success.reddit.repository.CommentRepository;
import com.success.reddit.repository.LinkRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class RedditApplication {

	public static void main(String[] args) {
		SpringApplication.run(RedditApplication.class, args);
	}

	@Bean
//	@Profile("dev")
	CommandLineRunner runner(LinkRepository linkRepository, CommentRepository commentRepository){
		return args -> {
			Link link = new Link("getting started with springboot 2", "https://www.google.com");
			linkRepository.save(link);
			Comment comment = new Comment("God abeg help our country nigeria", link);
			commentRepository.save(comment);
			link.addComment(comment);
		};
	}
}
