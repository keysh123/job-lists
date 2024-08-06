package com.keya.joblisting.Repository;

import com.keya.joblisting.models.Post;

import java.util.List;

public interface SearchRepository {
    List<Post> findByText(String text);
}
