package com.southwind.controller;

import com.southwind.entity.Student;
import com.southwind.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/hello")
public class HelloHandler {
    @Autowired
    private StudentRepository studentRepository;

    @GetMapping("/index")
    public String index() {
        System.out.println("/index.....");
        return "index";
    }

    @GetMapping("/index2")
    public ModelAndView index2() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("index2");
        modelAndView.addObject("list", studentRepository.findAll());
        return modelAndView;
    }


    @RequestMapping("/deleteById/{id}")
    public String deleteById(@PathVariable("id") long id) {
        studentRepository.deleteById(id);
        return "redirect:/hello/index2";
    }

    @RequestMapping("/save")
    public String save(Student student) {
        studentRepository.saveOrUpdate(student);
        return "redirect:/hello/index2";
    }


    @RequestMapping("/update")
    public String update(Student student) {
        studentRepository.saveOrUpdate(student);
        return "redirect:/hello/index2";
    }

    @RequestMapping("/updateById/{id}")
    public ModelAndView updateById(@PathVariable("id") long id) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("update");
        Student student = studentRepository.findById(id);
        modelAndView.addObject("student", student);
        return modelAndView;
    }
}
