package com.nguyenthaominh.exercise03.service;

import java.util.List;
import com.nguyenthaominh.exercise03.entity.Tag;

public interface TagService {
    Tag createTag(Tag tag);
    Tag getTagById(Integer tagId);
    List<Tag> getAllTags();
    Tag updateTag(Tag tag);
    void deleteTag(Integer tagId);
}