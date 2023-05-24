package com.chauhan.quizapp

object Constants {

    const val USER_NAME:String="user_name"
    const val TOTAL_QUESTIONS:String="total_question"
    const val CORRECT_ANSWERS:String="correct_answers"

    fun getQustions(): ArrayList<Questions> {
        val questionsList = ArrayList<Questions>()
        val que1 = Questions(
            1,
            "What country does this flag belong to?",
            R.drawable.q1,
            optionOne = "Argentina",
            optionTwo = "India",
            optionThree = "Korea",
            optionFour = "Brazil",
            correctAnswer = 1
        )
        questionsList.add(que1)

        val que2 = Questions(
            2, "What is the name of this fruit?",
            R.drawable.q2,
            optionOne = "Apple",
            optionTwo = "Dragon Fruit",
            optionThree = "Litchi",
            optionFour = "Cherry",
            correctAnswer = 2
        )
        questionsList.add(que2)

        val que3=Questions(
            3,"Identify the currency of the country",
             R.drawable.q3,
            optionOne ="America",
            optionTwo = "Australia",
            optionThree = "Korea",
            optionFour = "Sri Lanka",
            correctAnswer = 3
        )
        questionsList.add(que3)

        val que4=Questions(
            4,"What is the name of this player?",
                    R.drawable.q4,
            optionOne ="Virat Kohli",
            optionTwo = "David Miller",
            optionThree = "Mahendra Singh Dhoni",
            optionFour = "Glenn Maxwell",
            correctAnswer = 2
        )
        questionsList.add(que4)

        val que5=Questions(
            5,"What is name of this famous Businessman?",
            R.drawable.q5,
            optionOne ="Mukesh Ambani",
            optionTwo = "Gautam Adani",
            optionThree = "Warren Buffett",
            optionFour = "Jack Ma",
            correctAnswer = 3
        )
        questionsList.add(que5)
        return questionsList
    }
}