CREATE TABLE `sport_grade` (
`id` bigint(11) NOT NULL AUTO_INCREMENT,

`student_id` bigint(11) UNSIGNED NOT NULL,

`meter50` decimal(5,2) NOT NULL,
`meter50_grade` bigint(11) UNSIGNED NOT NULL,

`standing_jump` decimal(5,2) NOT NULL,
`standing_jump_grade` bigint(11) UNSIGNED NOT NULL,

`meter1500` bigint(11) UNSIGNED NOT NULL,
`meter1500_grade` bigint(11) UNSIGNED NOT NULL,

`abdominal_curl` bigint(11) UNSIGNED NOT NULL,
`abdominal_curl_grade` bigint(11) UNSIGNED NOT NULL,

`created_at` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
`updated_at` datetime ON UPDATE CURRENT_TIMESTAMP,
PRIMARY KEY (`id`) 
)
ENGINE = InnoDB
AUTO_INCREMENT = 1
DEFAULT CHARACTER SET = utf8
COLLATE = utf8_bin
ROW_FORMAT = compact;