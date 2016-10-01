package reddit2s3

import com.beust.jcommander.Parameter

/**
 * Data Class containing the commandline parameters
 */
class Command {
    @Parameter(names = arrayOf("-b", "--bucket"), description = "S3 bucket name", required = true)
    var bucket: String? = null

    @Parameter(names = arrayOf("-t", "--thread"), description = "Reddit thread", required = true)
    var thread: String? = null
}
