/*
 ADOBE CONFIDENTIAL
 ___________________

 Copyright 2011 Adobe Systems Incorporated
 All Rights Reserved.

 NOTICE:  All information contained herein is, and remains
 the property of Adobe Systems Incorporated and its suppliers,
 if any.  The intellectual and technical concepts contained
 herein are proprietary to Adobe Systems Incorporated and its
 suppliers and may be covered by U.S. and Foreign Patents,
 patents in process, and are protected by trade secret or copyright law.
 Dissemination of this information or reproduction of this material
 is strictly forbidden unless prior written permission is obtained
 from Adobe Systems Incorporated.
*/
if($.browser.SafariMobile&&parseFloat((/CPU.+OS ([0-9_]{3}).*AppleWebkit.*Mobile/i.exec(navigator.userAgent)||[0,"4_2"])[1].replace("_","."))<4.1)$.fn.Oldoffset=$.fn.offset,$.fn.offset=function(){var a=$(this).Oldoffset();a.top-=window.scrollY;a.left-=window.scrollX;return a};
(function(a){a.fn.toBrowserWidth=function(){return this.each(function(){var b=a(this).css({marginLeft:0}),c=b.outerWidth()-b.width(),d=0,e=null,f=function(){d!=a(window).width()&&(d=a(window).width(),b.css({left:0,width:0}),e===null&&(e=function(){var d=b.offset();b.css({width:a(window).width()-c,left:-d.left,marginRight:-a(window).width()+c+0});e=null},a.browser.msie&&a.browser.version<"9.0"?setTimeout(e,1):e()))};a(window).resize(f);a(document).ready(f)})}})(jQuery);
