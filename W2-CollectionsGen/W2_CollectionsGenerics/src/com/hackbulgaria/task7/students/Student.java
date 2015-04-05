package com.hackbulgaria.task7.students;

public class Student implements Comparable<Student> {

    String name;
    int grade;

    public Student(String str, int grade) {
        this.name = str;
        this.grade = grade;
    }

    @Override
    public int compareTo(Student o) {
        if (this.grade == o.grade) {
            if (this.name.compareTo(o.name) > 0) {
                return 1;
            } else {
                return -1;
            }
        } else if (this.grade > o.grade) {
            return -1;
        }
        return 1;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Student other = (Student) obj;
        if (grade != other.grade)
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", grade=" + grade + "]";
    }
}
