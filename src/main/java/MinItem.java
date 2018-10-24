
// you can also use imports, for example:

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class MinItem {

	public static void main(String[] args) {

		System.out.println("hello");
		String a = "my.song.mp3 11b\ngreatSong.flac 1000b\nnot3.txt 5b\nvideo.mp4 200b\ngame.exe 100b\nmov!e.mkv 10000b";
		System.out.println(solution(a));
	}

	public static String solution(String S) {

		String[] line = S.split("\\r?\\n");
		int musicLength = 0;
		int imagesLength = 0;
		int moviesLength = 0;
		int otherLength = 0;
		for (String temp : line) {
			System.out.println(temp);
			String[] arr = temp.split("\\s");
			String fileName = arr[0];
			String fSize = arr[1];
			fSize = fSize.substring(0, fSize.length() - 1);
			int fileSize = Integer.valueOf(fSize);

			String[] arr2 = fileName.split("\\.");
			String extension = arr2[arr2.length - 1];

			if ("mp3".equalsIgnoreCase(extension) || "aac".equalsIgnoreCase(extension)
					|| "flac".equalsIgnoreCase(extension)) {
				musicLength += fileSize;

			} else if ("jpg".equalsIgnoreCase(extension) || "bmp".equalsIgnoreCase(extension)
					|| "gif".equalsIgnoreCase(extension)) {
				imagesLength += fileSize;

			} else if ("mp4".equalsIgnoreCase(extension) || "avi".equalsIgnoreCase(extension)
					|| "mkv".equalsIgnoreCase(extension)) {
				moviesLength += fileSize;

			} else {
				otherLength += fileSize;
			}
		}
		String result = "";
		StringBuilder sb = new StringBuilder();

		String musicSize = musicLength == 0 ? "0b" : musicLength + "b";
		String imagesSize = imagesLength == 0 ? "0b" : imagesLength + "b";
		String moviesSize = moviesLength == 0 ? "0b" : moviesLength + "b";
		String otherSize = otherLength == 0 ? "0b" : otherLength + "b";

		sb.append("music " + musicSize);
		sb.append("\r\nimages " + imagesSize);
		sb.append("\r\nmovies " + moviesSize);
		sb.append("\r\nother " + otherSize);
		result = sb.toString();
		return result;
	}
}