package com.pirumart.notekeeper

object DataManager {
    val courses = HashMap<String, CourseInfo>()
    val notes = ArrayList<NoteInfo>()

    init {
        initializeCourses()
        initializeNotes()
    }

    private fun initializeCourses() {
        var course = CourseInfo("android_fundamentals", "Getting Started with Android")
        courses.set(course.courseId, course)

        course = CourseInfo("kotlin_essentials", "Enter the Kotlin Language")
        courses.set(course.courseId, course)

        course = CourseInfo("java_core", "Java the Batman Way")
        courses.set(course.courseId, course)
    }

    private fun initializeNotes() {
//        var note = NoteInfo()
    }
}