CREATE TABLE `sport_score` (
`id` bigint(11) NOT NULL AUTO_INCREMENT,

`student_id` bigint(11) UNSIGNED NOT NULL,

`meter_50_sprint` decimal(5,2) NOT NULL,
`meter_50_sprint_score` int(10) UNSIGNED NOT NULL,

`standing_jump` int(10) UNSIGNED NOT NULL,
`standing_jump_score` int(10) UNSIGNED NOT NULL,

`meter_1500_run` int(10) UNSIGNED NOT NULL,
`meter_1500_run_score` int(10) UNSIGNED NOT NULL,

`abdominal_curl` int(10) UNSIGNED NOT NULL,
`abdominal_curl_score` int(10) UNSIGNED NOT NULL,

`created_at` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
`updated_at` datetime ON UPDATE CURRENT_TIMESTAMP,
PRIMARY KEY (`id`) 
)
ENGINE = InnoDB
AUTO_INCREMENT = 1
DEFAULT CHARACTER SET = utf8
COLLATE = utf8_bin
ROW_FORMAT = compact;