package com.team2.gkquiz3
// October 17, 2022 - Team 2 - Anand and Muhammed
object Constants {
    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val SCORE: String = "score"

    fun getQuestions(): ArrayList<Question> {
        val questionsList = ArrayList<Question>()

        //1
        val questionOne = Question(
            1, "What is the fastest airplane in this world?",
            R.drawable.blackbird,
            arrayListOf(
                "Lockheed SR-71 Blackbird",
                "Lockheed YF-12",
                "XB-70 Valkyrie",
                "Bell X-2 Starbuster"),
            0)
        questionsList.add(questionOne)

        //2
        val questionTwo = Question(
            2, "Which U.S State is the only state to grow its own coffee beans?",
            R.drawable.coffee,
            arrayListOf(
                "Oregon",
                "Washington",
                "Hawaii",
                "California",),
            2)
        questionsList.add(questionTwo)

        //3
        val questionThree = Question(
            3, "What geometric shape is generally used for stop signs?",
            R.drawable.stop,
            arrayListOf(
                "Decagon",
                "Pentagon",
                "Hexagon",
                "Octagon",),
            3)
        questionsList.add(questionThree)

        //4
        val questionFour = Question(
            4, "What was the original name of the search engine \"Google\"?",
            R.drawable.google,
            arrayListOf(
                "Bing",
                "BackRub",
                "Ask",
                "Alexandria",),
            1)
        questionsList.add(questionFour)

        //5
        val questionFive = Question(
            5, "What alcoholic drink is mainly made from juniper berries? ",
            R.drawable.juniper,
            arrayListOf(
                "Vodka",
                "Rum",
                "Gin",
                "Tequila",),
            2)
        questionsList.add(questionFive)

        //6
        val questionSix = Question(
            6, "Which of these cities is NOT in England?",
            R.drawable.london,
            arrayListOf(
                "Edinburgh",
                "Birmingham",
                "Liverpool",
                "Bristol ",),
            0)
        questionsList.add(questionSix)

        //7
        val questionSeven = Question(
            7, "The term \"battery\" to describe an electrical storage device was coined by?",
            R.drawable.batterydura,
            arrayListOf(
                "Nikola Tesla",
                "Thomas Edison",
                "Benjamin Franklin ",
                "Ada Lovelace",),
            2)
        questionsList.add(questionSeven)

        //8
        val questionEight = Question(
            8, "How many eyes do caterpillars have?",
            R.drawable.caterpillar,
            arrayListOf(
                "Eight",
                "four",
                "two",
                "Twelve",),
            3)
        questionsList.add(questionEight)

        //9
        val questionNine = Question(
            9, "Which country was NOT part of the Soviet Union?",
            R.drawable.soviet,
            arrayListOf(
                "Azerbaijan",
                "Romania ",
                "Kyrgyzstan",
                "Estonia ",),
            1)
        questionsList.add(questionNine)

        //10
        val questionTen = Question(
            10, "What is the world's fastest bird?",
            R.drawable.peregrine_falcon,
            arrayListOf(
                "The Peregrine Falcon",
                "Golden Eagle",
                "Pigeon",
                "Frigate Bird",),
            0)
        questionsList.add(questionTen)


        return questionsList
    }
}