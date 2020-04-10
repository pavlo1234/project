function load(lang) {
	let href = window.location.href;

	if (href.indexOf('?') == -1)
		href += "?lang=" + lang;
	else if (href.indexOf("?lang=ua") != -1)
		href = href.replace("?lang=ua", "?lang=" + lang);
	else if (href.indexOf("?lang=en") != -1)
		href = href.replace("?lang=en", "?lang=" + lang);

	if (href.indexOf("&lang=ua") != -1)
		href = href.replace("&lang=ua", "&lang=" + lang);
	else if (href.indexOf("&lang=en") != -1)
		href = href.replace("&lang=en", "&lang=" + lang);
	else
		href += "&lang=" + lang;

	window.location.href = href;

}