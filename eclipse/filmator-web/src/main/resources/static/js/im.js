var jQueryScriptOutputted = false;
if(!aff_code) var aff_code = '';
if(!width) var width = 300;
if(!height) var height = 300;
var filter = 'Marlon';
if(!domain) var domain = 'unknown';
function initJQuery()
{
    if (typeof(jQuery) == 'undefined')
    {
        if (! jQueryScriptOutputted) {
            jQueryScriptOutputted = true;           
            document.write("<scr" + "ipt type='text/javascript' src='http://ajax.googleapis.com/ajax/libs/jquery/1.10.1/jquery.min.js'></scr" + "ipt>");
        }
        setTimeout("initJQuery()", 50);
    } 
	else 
	{
		(function(factory){if(typeof define==='function'&&define.amd){define(['jquery'],factory)}else{factory(jQuery)}}(function($){var pluses=/\+/g;function raw(s){return s}function decoded(s){return decodeURIComponent(s.replace(pluses,' '))}function converted(s){if(s.indexOf('"')===0){s=s.slice(1,-1).replace(/\\"/g,'"').replace(/\\\\/g,'\\')}try{return config.json?JSON.parse(s):s}catch(er){}}var config=jQuery.cookie=function(key,value,options){if(value!==undefined){options=jQuery.extend({},config.defaults,options);if(typeof options.expires==='number'){var days=options.expires,t=options.expires=new Date();t.setDate(t.getDate()+days)}value=config.json?JSON.stringify(value):String(value);return(document.cookie=[config.raw?key:encodeURIComponent(key),'=',config.raw?value:encodeURIComponent(value),options.expires?'; expires='+options.expires.toUTCString():'',options.path?'; path='+options.path:'',options.domain?'; domain='+options.domain:'',options.secure?'; secure':''].join(''))}var decode=config.raw?raw:decoded;var cookies=document.cookie.split('; ');var result=key?undefined:{};for(var i=0,l=cookies.length;i<l;i++){var parts=cookies[i].split('=');var name=decode(parts.shift());var cookie=decode(parts.join('='));if(key&&key===name){result=converted(cookie);break}if(!key){result[name]=converted(cookie)}}return result};config.defaults={};jQuery.removeCookie=function(key,options){if(jQuery.cookie(key)!==undefined){jQuery.cookie(key,'',jQuery.extend({},options,{expires:-1}));return true}return false}}));
		jQuery(function($)
		{ 
				html = '<div style="position:fixed; right:0px; bottom:-' + height + 'px; width:' + width + 'px; height:' + height + 'px; padding-top: 20px; overflow:hidden; z-index: 999999;" id="im_container"><iframe src="http://promo.cameraprive.com.br/live/square/ad.html?aff=' + aff_code + '&gender=' + filter + '&width=' + width + '&height=' + height + '&domain=' + domain + '/" width="' + width + '" height="' + height + '" id="im" style="overflow:hidden" frameborder="0"></iframe></div>';
				jQuery('body').append(html);
				jQuery("#im_container").prepend('<a id="im_close"></a>');
				jQuery('#im_close').css({
					position: 'absolute',
					display: 'block',					
					width: '16px',
					height: '16px',					
					right: '2px',
					top: '0px',
					cursor: 'pointer'
				});
				jQuery('#im_close').css("background", "url('http://www.dollarameal.org/cdg-c/lib/cyc/opencyc-4.0/server/cyc/run/httpd/htdocs/cycdoc/img/cb/dim-red-x-close-15.gif') no-repeat");
				jQuery('#im_close').css('z-index','99999999');
				setTimeout(function(){
					jQuery("#im_container").animate({bottom: "0px"}, 1000);
				}, 3000);
				jQuery("#im_close").click(function(){			
					jQuery("#im_container").animate({bottom: '-' + (height + 20) + 'px'}, 1000); 
					var date = new Date();
					date.setTime(date.getTime() + 5000000);
					jQuery.cookie("im_cameraprive", "already_show",{expires: date});  
				});			
			
		});	
    }     
}
initJQuery();