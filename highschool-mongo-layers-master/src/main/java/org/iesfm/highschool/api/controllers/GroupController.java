package org.iesfm.highschool.api.controllers;

import org.iesfm.highschool.api.controllers.pojos.GroupApi;
import org.iesfm.highschool.pojos.Group;
import org.iesfm.highschool.services.GroupService;
import org.iesfm.highschool.services.exceptions.StudentNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

@RestController
public class GroupController {

    private GroupService groupService;

    public GroupController(GroupService groupService) {
        this.groupService = groupService;
    }

    @RequestMapping(method = RequestMethod.GET, path = "/groups")
    public List<GroupApi> list() {
        return convert(
                groupService.list(),
                g -> convertToApi(g)
        );
    }

    @RequestMapping(method = RequestMethod.POST, path = "/groups")
    public void addGroup(@RequestBody GroupApi group) {
        if (!groupService.insert(convertToModel(group))) {
            throw new ResponseStatusException(HttpStatus.CONFLICT, "Ya existe");
        }
    }

    @RequestMapping(method = RequestMethod.GET, path = "/students/{nif}/group")
    public GroupApi addGroup(@PathVariable("nif") String nif) {
        Group group = null;
        try {
            group = groupService.getStudentGroup(nif);
            return convertToApi(group);
        } catch (StudentNotFoundException e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "");
        }

    }


    public GroupApi convertToApi(Group group) {
        return new GroupApi(
                group.getId(),
                group.getTitle(),
                group.getCourse(),
                group.getLetter(),
                group.getClassroom(),
                group.getYear()
        );
    }

    public Group convertToModel(GroupApi group) {
        return new Group(
                group.getId(),
                group.getTitle(),
                group.getCourse(),
                group.getLetter(),
                group.getClassroom(),
                group.getYear()
        );
    }

    public <T1, T2> List<T2> convert(
            List<T1> list,
            Function<T1, T2> fn
    ) {
        return list
                .stream()
                .map(t1 -> fn.apply(t1))
                .collect(Collectors.toList());
    }
}
