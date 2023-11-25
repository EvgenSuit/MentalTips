package com.example.mindtherapy.data

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.example.mindtherapy.R

data class TherapyItem (
    @StringRes val title: Int,
    @DrawableRes val img: Int,
    @StringRes val desc: Int
)

val data = listOf(
    TherapyItem(R.string.accept, R.drawable.accept, R.string.accept_desc),
    TherapyItem(R.string.be_grateful, R.drawable.be_grateful, R.string.be_grateful_desc),
    TherapyItem(R.string.choose, R.drawable.choose_what_to_worry_about, R.string.choose_desc),
    TherapyItem(R.string.create_calming_environment, R.drawable.create_calming_environment, R.string.create_calming_environment_desc),
    TherapyItem(R.string.create_sleep_schedule, R.drawable.create_sleep_schedule, R.string.create_sleep_schedule_desc),
    TherapyItem(R.string.wait_for_right_people, R.drawable.wait_for_right_people, R.string.wait_for_right_people_desc),
    TherapyItem(R.string.dont_judge_others, R.drawable.dont_judge_others, R.string.dont_judge_others_desc),
    TherapyItem(R.string.embrace_bad_days, R.drawable.embrace_bad_days, R.string.embrace_bad_days_desc),
    TherapyItem(R.string.set_boundaries, R.drawable.set_boundaries, R.string.set_boundaries_desc),
    TherapyItem(R.string.find_a_hobby, R.drawable.find_a_hobby, R.string.find_a_hobby_desc),
    TherapyItem(R.string.go_for_a_walk, R.drawable.go_for_a_walk, R.string.go_for_a_walk_desc),
    TherapyItem(R.string.listen_to_inner_voice, R.drawable.inner_voice, R.string.listen_to_inner_voice_desc),
    TherapyItem(R.string.keep_a_diet, R.drawable.keep_a_diet, R.string.keep_a_diet_desc),
    TherapyItem(R.string.let_go, R.drawable.let_go, R.string.let_go_desc),
    TherapyItem(R.string.let_go_of_control, R.drawable.let_go_of_control, R.string.let_go_of_control_desc),
    TherapyItem(R.string.life_wont_last_forever, R.drawable.life_wont_last_forever, R.string.life_wont_last_forever_desc),
    TherapyItem(R.string.listen_to_music, R.drawable.listen_to_music, R.string.listen_to_music_desc),
    TherapyItem(R.string.live_in_the_present, R.drawable.live_in_the_present, R.string.live_in_the_present_desc),
    TherapyItem(R.string.meditate, R.drawable.meditate, R.string.meditate_desc),
    TherapyItem(R.string.observe_what_you_talk_about, R.drawable.observe_what_you_talk_about, R.string.observe_what_you_talk_about_desc),
    TherapyItem(R.string.relax, R.drawable.relax, R.string.relax_desc),
    TherapyItem(R.string.sense_of_self, R.drawable.sense_of_self, R.string.sense_of_self_desc),
    TherapyItem(R.string.stay_positive, R.drawable.stay_positive, R.string.stay_positive_desc),
    TherapyItem(R.string.take_a_break, R.drawable.take_a_break, R.string.take_a_break_desc),
    TherapyItem(R.string.take_care_of_your_body, R.drawable.take_care_of_your_body, R.string.take_care_of_your_body_desc),
    TherapyItem(R.string.talk_to_yourself, R.drawable.talk_to_yourself, R.string.talk_to_yourself_desc),
    TherapyItem(R.string.visualize, R.drawable.visualize, R.string.visualize_desc),
    TherapyItem(R.string.watch_a_movie, R.drawable.watch_a_movie_you_enjoy, R.string.watch_a_movie_desc),
    TherapyItem(R.string.write_thoughts_down, R.drawable.write_thoughts_down, R.string.write_thoughts_down_desc),
)