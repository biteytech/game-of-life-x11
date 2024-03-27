// Generated by jextract

package tech.bitey.golpanama.xlib;

import java.lang.invoke.*;
import java.lang.foreign.*;
import java.nio.ByteOrder;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

import static java.lang.foreign.ValueLayout.*;
import static java.lang.foreign.MemoryLayout.PathElement.*;

/**
 * {@snippet lang=c :
 * struct {
 *     int x;
 *     int y;
 *     int width;
 *     int height;
 *     int border_width;
 *     int depth;
 *     Visual *visual;
 *     Window root;
 *     int class;
 *     int bit_gravity;
 *     int win_gravity;
 *     int backing_store;
 *     unsigned long backing_planes;
 *     unsigned long backing_pixel;
 *     int save_under;
 *     Colormap colormap;
 *     int map_installed;
 *     int map_state;
 *     long all_event_masks;
 *     long your_event_mask;
 *     long do_not_propagate_mask;
 *     int override_redirect;
 *     Screen *screen;
 * }
 * }
 */
public class XWindowAttributes {

    XWindowAttributes() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        Xlib_h.C_INT.withName("x"),
        Xlib_h.C_INT.withName("y"),
        Xlib_h.C_INT.withName("width"),
        Xlib_h.C_INT.withName("height"),
        Xlib_h.C_INT.withName("border_width"),
        Xlib_h.C_INT.withName("depth"),
        Xlib_h.C_POINTER.withName("visual"),
        Xlib_h.C_LONG.withName("root"),
        Xlib_h.C_INT.withName("class"),
        Xlib_h.C_INT.withName("bit_gravity"),
        Xlib_h.C_INT.withName("win_gravity"),
        Xlib_h.C_INT.withName("backing_store"),
        Xlib_h.C_LONG.withName("backing_planes"),
        Xlib_h.C_LONG.withName("backing_pixel"),
        Xlib_h.C_INT.withName("save_under"),
        MemoryLayout.paddingLayout(4),
        Xlib_h.C_LONG.withName("colormap"),
        Xlib_h.C_INT.withName("map_installed"),
        Xlib_h.C_INT.withName("map_state"),
        Xlib_h.C_LONG.withName("all_event_masks"),
        Xlib_h.C_LONG.withName("your_event_mask"),
        Xlib_h.C_LONG.withName("do_not_propagate_mask"),
        Xlib_h.C_INT.withName("override_redirect"),
        MemoryLayout.paddingLayout(4),
        Xlib_h.C_POINTER.withName("screen")
    ).withName("$anon$308:9");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt x$LAYOUT = (OfInt)$LAYOUT.select(groupElement("x"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int x
     * }
     */
    public static final OfInt x$layout() {
        return x$LAYOUT;
    }

    private static final long x$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int x
     * }
     */
    public static final long x$offset() {
        return x$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int x
     * }
     */
    public static int x(MemorySegment struct) {
        return struct.get(x$LAYOUT, x$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int x
     * }
     */
    public static void x(MemorySegment struct, int fieldValue) {
        struct.set(x$LAYOUT, x$OFFSET, fieldValue);
    }

    private static final OfInt y$LAYOUT = (OfInt)$LAYOUT.select(groupElement("y"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int y
     * }
     */
    public static final OfInt y$layout() {
        return y$LAYOUT;
    }

    private static final long y$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int y
     * }
     */
    public static final long y$offset() {
        return y$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int y
     * }
     */
    public static int y(MemorySegment struct) {
        return struct.get(y$LAYOUT, y$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int y
     * }
     */
    public static void y(MemorySegment struct, int fieldValue) {
        struct.set(y$LAYOUT, y$OFFSET, fieldValue);
    }

    private static final OfInt width$LAYOUT = (OfInt)$LAYOUT.select(groupElement("width"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int width
     * }
     */
    public static final OfInt width$layout() {
        return width$LAYOUT;
    }

    private static final long width$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int width
     * }
     */
    public static final long width$offset() {
        return width$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int width
     * }
     */
    public static int width(MemorySegment struct) {
        return struct.get(width$LAYOUT, width$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int width
     * }
     */
    public static void width(MemorySegment struct, int fieldValue) {
        struct.set(width$LAYOUT, width$OFFSET, fieldValue);
    }

    private static final OfInt height$LAYOUT = (OfInt)$LAYOUT.select(groupElement("height"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int height
     * }
     */
    public static final OfInt height$layout() {
        return height$LAYOUT;
    }

    private static final long height$OFFSET = 12;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int height
     * }
     */
    public static final long height$offset() {
        return height$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int height
     * }
     */
    public static int height(MemorySegment struct) {
        return struct.get(height$LAYOUT, height$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int height
     * }
     */
    public static void height(MemorySegment struct, int fieldValue) {
        struct.set(height$LAYOUT, height$OFFSET, fieldValue);
    }

    private static final OfInt border_width$LAYOUT = (OfInt)$LAYOUT.select(groupElement("border_width"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int border_width
     * }
     */
    public static final OfInt border_width$layout() {
        return border_width$LAYOUT;
    }

    private static final long border_width$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int border_width
     * }
     */
    public static final long border_width$offset() {
        return border_width$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int border_width
     * }
     */
    public static int border_width(MemorySegment struct) {
        return struct.get(border_width$LAYOUT, border_width$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int border_width
     * }
     */
    public static void border_width(MemorySegment struct, int fieldValue) {
        struct.set(border_width$LAYOUT, border_width$OFFSET, fieldValue);
    }

    private static final OfInt depth$LAYOUT = (OfInt)$LAYOUT.select(groupElement("depth"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int depth
     * }
     */
    public static final OfInt depth$layout() {
        return depth$LAYOUT;
    }

    private static final long depth$OFFSET = 20;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int depth
     * }
     */
    public static final long depth$offset() {
        return depth$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int depth
     * }
     */
    public static int depth(MemorySegment struct) {
        return struct.get(depth$LAYOUT, depth$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int depth
     * }
     */
    public static void depth(MemorySegment struct, int fieldValue) {
        struct.set(depth$LAYOUT, depth$OFFSET, fieldValue);
    }

    private static final AddressLayout visual$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("visual"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * Visual *visual
     * }
     */
    public static final AddressLayout visual$layout() {
        return visual$LAYOUT;
    }

    private static final long visual$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * Visual *visual
     * }
     */
    public static final long visual$offset() {
        return visual$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * Visual *visual
     * }
     */
    public static MemorySegment visual(MemorySegment struct) {
        return struct.get(visual$LAYOUT, visual$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * Visual *visual
     * }
     */
    public static void visual(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(visual$LAYOUT, visual$OFFSET, fieldValue);
    }

    private static final OfLong root$LAYOUT = (OfLong)$LAYOUT.select(groupElement("root"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * Window root
     * }
     */
    public static final OfLong root$layout() {
        return root$LAYOUT;
    }

    private static final long root$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * Window root
     * }
     */
    public static final long root$offset() {
        return root$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * Window root
     * }
     */
    public static long root(MemorySegment struct) {
        return struct.get(root$LAYOUT, root$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * Window root
     * }
     */
    public static void root(MemorySegment struct, long fieldValue) {
        struct.set(root$LAYOUT, root$OFFSET, fieldValue);
    }

    private static final OfInt class_$LAYOUT = (OfInt)$LAYOUT.select(groupElement("class"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int class
     * }
     */
    public static final OfInt class_$layout() {
        return class_$LAYOUT;
    }

    private static final long class_$OFFSET = 40;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int class
     * }
     */
    public static final long class_$offset() {
        return class_$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int class
     * }
     */
    public static int class_(MemorySegment struct) {
        return struct.get(class_$LAYOUT, class_$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int class
     * }
     */
    public static void class_(MemorySegment struct, int fieldValue) {
        struct.set(class_$LAYOUT, class_$OFFSET, fieldValue);
    }

    private static final OfInt bit_gravity$LAYOUT = (OfInt)$LAYOUT.select(groupElement("bit_gravity"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int bit_gravity
     * }
     */
    public static final OfInt bit_gravity$layout() {
        return bit_gravity$LAYOUT;
    }

    private static final long bit_gravity$OFFSET = 44;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int bit_gravity
     * }
     */
    public static final long bit_gravity$offset() {
        return bit_gravity$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int bit_gravity
     * }
     */
    public static int bit_gravity(MemorySegment struct) {
        return struct.get(bit_gravity$LAYOUT, bit_gravity$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int bit_gravity
     * }
     */
    public static void bit_gravity(MemorySegment struct, int fieldValue) {
        struct.set(bit_gravity$LAYOUT, bit_gravity$OFFSET, fieldValue);
    }

    private static final OfInt win_gravity$LAYOUT = (OfInt)$LAYOUT.select(groupElement("win_gravity"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int win_gravity
     * }
     */
    public static final OfInt win_gravity$layout() {
        return win_gravity$LAYOUT;
    }

    private static final long win_gravity$OFFSET = 48;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int win_gravity
     * }
     */
    public static final long win_gravity$offset() {
        return win_gravity$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int win_gravity
     * }
     */
    public static int win_gravity(MemorySegment struct) {
        return struct.get(win_gravity$LAYOUT, win_gravity$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int win_gravity
     * }
     */
    public static void win_gravity(MemorySegment struct, int fieldValue) {
        struct.set(win_gravity$LAYOUT, win_gravity$OFFSET, fieldValue);
    }

    private static final OfInt backing_store$LAYOUT = (OfInt)$LAYOUT.select(groupElement("backing_store"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int backing_store
     * }
     */
    public static final OfInt backing_store$layout() {
        return backing_store$LAYOUT;
    }

    private static final long backing_store$OFFSET = 52;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int backing_store
     * }
     */
    public static final long backing_store$offset() {
        return backing_store$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int backing_store
     * }
     */
    public static int backing_store(MemorySegment struct) {
        return struct.get(backing_store$LAYOUT, backing_store$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int backing_store
     * }
     */
    public static void backing_store(MemorySegment struct, int fieldValue) {
        struct.set(backing_store$LAYOUT, backing_store$OFFSET, fieldValue);
    }

    private static final OfLong backing_planes$LAYOUT = (OfLong)$LAYOUT.select(groupElement("backing_planes"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * unsigned long backing_planes
     * }
     */
    public static final OfLong backing_planes$layout() {
        return backing_planes$LAYOUT;
    }

    private static final long backing_planes$OFFSET = 56;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * unsigned long backing_planes
     * }
     */
    public static final long backing_planes$offset() {
        return backing_planes$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * unsigned long backing_planes
     * }
     */
    public static long backing_planes(MemorySegment struct) {
        return struct.get(backing_planes$LAYOUT, backing_planes$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * unsigned long backing_planes
     * }
     */
    public static void backing_planes(MemorySegment struct, long fieldValue) {
        struct.set(backing_planes$LAYOUT, backing_planes$OFFSET, fieldValue);
    }

    private static final OfLong backing_pixel$LAYOUT = (OfLong)$LAYOUT.select(groupElement("backing_pixel"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * unsigned long backing_pixel
     * }
     */
    public static final OfLong backing_pixel$layout() {
        return backing_pixel$LAYOUT;
    }

    private static final long backing_pixel$OFFSET = 64;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * unsigned long backing_pixel
     * }
     */
    public static final long backing_pixel$offset() {
        return backing_pixel$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * unsigned long backing_pixel
     * }
     */
    public static long backing_pixel(MemorySegment struct) {
        return struct.get(backing_pixel$LAYOUT, backing_pixel$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * unsigned long backing_pixel
     * }
     */
    public static void backing_pixel(MemorySegment struct, long fieldValue) {
        struct.set(backing_pixel$LAYOUT, backing_pixel$OFFSET, fieldValue);
    }

    private static final OfInt save_under$LAYOUT = (OfInt)$LAYOUT.select(groupElement("save_under"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int save_under
     * }
     */
    public static final OfInt save_under$layout() {
        return save_under$LAYOUT;
    }

    private static final long save_under$OFFSET = 72;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int save_under
     * }
     */
    public static final long save_under$offset() {
        return save_under$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int save_under
     * }
     */
    public static int save_under(MemorySegment struct) {
        return struct.get(save_under$LAYOUT, save_under$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int save_under
     * }
     */
    public static void save_under(MemorySegment struct, int fieldValue) {
        struct.set(save_under$LAYOUT, save_under$OFFSET, fieldValue);
    }

    private static final OfLong colormap$LAYOUT = (OfLong)$LAYOUT.select(groupElement("colormap"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * Colormap colormap
     * }
     */
    public static final OfLong colormap$layout() {
        return colormap$LAYOUT;
    }

    private static final long colormap$OFFSET = 80;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * Colormap colormap
     * }
     */
    public static final long colormap$offset() {
        return colormap$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * Colormap colormap
     * }
     */
    public static long colormap(MemorySegment struct) {
        return struct.get(colormap$LAYOUT, colormap$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * Colormap colormap
     * }
     */
    public static void colormap(MemorySegment struct, long fieldValue) {
        struct.set(colormap$LAYOUT, colormap$OFFSET, fieldValue);
    }

    private static final OfInt map_installed$LAYOUT = (OfInt)$LAYOUT.select(groupElement("map_installed"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int map_installed
     * }
     */
    public static final OfInt map_installed$layout() {
        return map_installed$LAYOUT;
    }

    private static final long map_installed$OFFSET = 88;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int map_installed
     * }
     */
    public static final long map_installed$offset() {
        return map_installed$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int map_installed
     * }
     */
    public static int map_installed(MemorySegment struct) {
        return struct.get(map_installed$LAYOUT, map_installed$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int map_installed
     * }
     */
    public static void map_installed(MemorySegment struct, int fieldValue) {
        struct.set(map_installed$LAYOUT, map_installed$OFFSET, fieldValue);
    }

    private static final OfInt map_state$LAYOUT = (OfInt)$LAYOUT.select(groupElement("map_state"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int map_state
     * }
     */
    public static final OfInt map_state$layout() {
        return map_state$LAYOUT;
    }

    private static final long map_state$OFFSET = 92;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int map_state
     * }
     */
    public static final long map_state$offset() {
        return map_state$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int map_state
     * }
     */
    public static int map_state(MemorySegment struct) {
        return struct.get(map_state$LAYOUT, map_state$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int map_state
     * }
     */
    public static void map_state(MemorySegment struct, int fieldValue) {
        struct.set(map_state$LAYOUT, map_state$OFFSET, fieldValue);
    }

    private static final OfLong all_event_masks$LAYOUT = (OfLong)$LAYOUT.select(groupElement("all_event_masks"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * long all_event_masks
     * }
     */
    public static final OfLong all_event_masks$layout() {
        return all_event_masks$LAYOUT;
    }

    private static final long all_event_masks$OFFSET = 96;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * long all_event_masks
     * }
     */
    public static final long all_event_masks$offset() {
        return all_event_masks$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * long all_event_masks
     * }
     */
    public static long all_event_masks(MemorySegment struct) {
        return struct.get(all_event_masks$LAYOUT, all_event_masks$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * long all_event_masks
     * }
     */
    public static void all_event_masks(MemorySegment struct, long fieldValue) {
        struct.set(all_event_masks$LAYOUT, all_event_masks$OFFSET, fieldValue);
    }

    private static final OfLong your_event_mask$LAYOUT = (OfLong)$LAYOUT.select(groupElement("your_event_mask"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * long your_event_mask
     * }
     */
    public static final OfLong your_event_mask$layout() {
        return your_event_mask$LAYOUT;
    }

    private static final long your_event_mask$OFFSET = 104;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * long your_event_mask
     * }
     */
    public static final long your_event_mask$offset() {
        return your_event_mask$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * long your_event_mask
     * }
     */
    public static long your_event_mask(MemorySegment struct) {
        return struct.get(your_event_mask$LAYOUT, your_event_mask$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * long your_event_mask
     * }
     */
    public static void your_event_mask(MemorySegment struct, long fieldValue) {
        struct.set(your_event_mask$LAYOUT, your_event_mask$OFFSET, fieldValue);
    }

    private static final OfLong do_not_propagate_mask$LAYOUT = (OfLong)$LAYOUT.select(groupElement("do_not_propagate_mask"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * long do_not_propagate_mask
     * }
     */
    public static final OfLong do_not_propagate_mask$layout() {
        return do_not_propagate_mask$LAYOUT;
    }

    private static final long do_not_propagate_mask$OFFSET = 112;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * long do_not_propagate_mask
     * }
     */
    public static final long do_not_propagate_mask$offset() {
        return do_not_propagate_mask$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * long do_not_propagate_mask
     * }
     */
    public static long do_not_propagate_mask(MemorySegment struct) {
        return struct.get(do_not_propagate_mask$LAYOUT, do_not_propagate_mask$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * long do_not_propagate_mask
     * }
     */
    public static void do_not_propagate_mask(MemorySegment struct, long fieldValue) {
        struct.set(do_not_propagate_mask$LAYOUT, do_not_propagate_mask$OFFSET, fieldValue);
    }

    private static final OfInt override_redirect$LAYOUT = (OfInt)$LAYOUT.select(groupElement("override_redirect"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int override_redirect
     * }
     */
    public static final OfInt override_redirect$layout() {
        return override_redirect$LAYOUT;
    }

    private static final long override_redirect$OFFSET = 120;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int override_redirect
     * }
     */
    public static final long override_redirect$offset() {
        return override_redirect$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int override_redirect
     * }
     */
    public static int override_redirect(MemorySegment struct) {
        return struct.get(override_redirect$LAYOUT, override_redirect$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int override_redirect
     * }
     */
    public static void override_redirect(MemorySegment struct, int fieldValue) {
        struct.set(override_redirect$LAYOUT, override_redirect$OFFSET, fieldValue);
    }

    private static final AddressLayout screen$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("screen"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * Screen *screen
     * }
     */
    public static final AddressLayout screen$layout() {
        return screen$LAYOUT;
    }

    private static final long screen$OFFSET = 128;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * Screen *screen
     * }
     */
    public static final long screen$offset() {
        return screen$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * Screen *screen
     * }
     */
    public static MemorySegment screen(MemorySegment struct) {
        return struct.get(screen$LAYOUT, screen$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * Screen *screen
     * }
     */
    public static void screen(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(screen$LAYOUT, screen$OFFSET, fieldValue);
    }

    /**
     * Obtains a slice of {@code arrayParam} which selects the array element at {@code index}.
     * The returned segment has address {@code arrayParam.address() + index * layout().byteSize()}
     */
    public static MemorySegment asSlice(MemorySegment array, long index) {
        return array.asSlice(layout().byteSize() * index);
    }

    /**
     * The size (in bytes) of this struct
     */
    public static long sizeof() { return layout().byteSize(); }

    /**
     * Allocate a segment of size {@code layout().byteSize()} using {@code allocator}
     */
    public static MemorySegment allocate(SegmentAllocator allocator) {
        return allocator.allocate(layout());
    }

    /**
     * Allocate an array of size {@code elementCount} using {@code allocator}.
     * The returned segment has size {@code elementCount * layout().byteSize()}.
     */
    public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(elementCount, layout()));
    }

    /**
     * Reinterprets {@code addr} using target {@code arena} and {@code cleanupAction) (if any).
     * The returned segment has size {@code layout().byteSize()}
     */
    public static MemorySegment reinterpret(MemorySegment addr, Arena arena, Consumer<MemorySegment> cleanup) {
        return reinterpret(addr, 1, arena, cleanup);
    }

    /**
     * Reinterprets {@code addr} using target {@code arena} and {@code cleanupAction) (if any).
     * The returned segment has size {@code elementCount * layout().byteSize()}
     */
    public static MemorySegment reinterpret(MemorySegment addr, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
        return addr.reinterpret(layout().byteSize() * elementCount, arena, cleanup);
    }
}

