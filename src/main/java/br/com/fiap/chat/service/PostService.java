package br.com.fiap.chat.service;

import br.com.fiap.chat.dto.PostDTO;
import br.com.fiap.chat.entity.Post;
import br.com.fiap.chat.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PostService {

    @Autowired
    private PostRepository postRepository;

    public List<PostDTO> getFeedPosts() {
        List<Post> posts = postRepository.findAll();
        return posts.stream()
                .map(post -> {
                    PostDTO dto = new PostDTO();
                    dto.setId(post.getId());
                    dto.setConteudo(post.getConteudo());
                    dto.setDataCriacao(post.getDataCriacao());
                    // Add additional mappings for comments and reactions
                    return dto;
                })
                .collect(Collectors.toList());
    }
}
