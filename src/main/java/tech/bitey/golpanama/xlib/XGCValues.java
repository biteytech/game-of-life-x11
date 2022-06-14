// Generated by jextract

package tech.bitey.golpanama.xlib;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public class XGCValues {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_INT$LAYOUT.withName("function"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_LONG_LONG$LAYOUT.withName("plane_mask"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("foreground"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("background"),
        Constants$root.C_INT$LAYOUT.withName("line_width"),
        Constants$root.C_INT$LAYOUT.withName("line_style"),
        Constants$root.C_INT$LAYOUT.withName("cap_style"),
        Constants$root.C_INT$LAYOUT.withName("join_style"),
        Constants$root.C_INT$LAYOUT.withName("fill_style"),
        Constants$root.C_INT$LAYOUT.withName("fill_rule"),
        Constants$root.C_INT$LAYOUT.withName("arc_mode"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_LONG_LONG$LAYOUT.withName("tile"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("stipple"),
        Constants$root.C_INT$LAYOUT.withName("ts_x_origin"),
        Constants$root.C_INT$LAYOUT.withName("ts_y_origin"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("font"),
        Constants$root.C_INT$LAYOUT.withName("subwindow_mode"),
        Constants$root.C_INT$LAYOUT.withName("graphics_exposures"),
        Constants$root.C_INT$LAYOUT.withName("clip_x_origin"),
        Constants$root.C_INT$LAYOUT.withName("clip_y_origin"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("clip_mask"),
        Constants$root.C_INT$LAYOUT.withName("dash_offset"),
        Constants$root.C_CHAR$LAYOUT.withName("dashes"),
        MemoryLayout.paddingLayout(24)
    );
    public static MemoryLayout $LAYOUT() {
        return XGCValues.$struct$LAYOUT;
    }
    static final VarHandle function$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("function"));
    public static VarHandle function$VH() {
        return XGCValues.function$VH;
    }
    public static int function$get(MemorySegment seg) {
        return (int)XGCValues.function$VH.get(seg);
    }
    public static void function$set( MemorySegment seg, int x) {
        XGCValues.function$VH.set(seg, x);
    }
    public static int function$get(MemorySegment seg, long index) {
        return (int)XGCValues.function$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void function$set(MemorySegment seg, long index, int x) {
        XGCValues.function$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle plane_mask$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("plane_mask"));
    public static VarHandle plane_mask$VH() {
        return XGCValues.plane_mask$VH;
    }
    public static long plane_mask$get(MemorySegment seg) {
        return (long)XGCValues.plane_mask$VH.get(seg);
    }
    public static void plane_mask$set( MemorySegment seg, long x) {
        XGCValues.plane_mask$VH.set(seg, x);
    }
    public static long plane_mask$get(MemorySegment seg, long index) {
        return (long)XGCValues.plane_mask$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void plane_mask$set(MemorySegment seg, long index, long x) {
        XGCValues.plane_mask$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle foreground$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("foreground"));
    public static VarHandle foreground$VH() {
        return XGCValues.foreground$VH;
    }
    public static long foreground$get(MemorySegment seg) {
        return (long)XGCValues.foreground$VH.get(seg);
    }
    public static void foreground$set( MemorySegment seg, long x) {
        XGCValues.foreground$VH.set(seg, x);
    }
    public static long foreground$get(MemorySegment seg, long index) {
        return (long)XGCValues.foreground$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void foreground$set(MemorySegment seg, long index, long x) {
        XGCValues.foreground$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle background$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("background"));
    public static VarHandle background$VH() {
        return XGCValues.background$VH;
    }
    public static long background$get(MemorySegment seg) {
        return (long)XGCValues.background$VH.get(seg);
    }
    public static void background$set( MemorySegment seg, long x) {
        XGCValues.background$VH.set(seg, x);
    }
    public static long background$get(MemorySegment seg, long index) {
        return (long)XGCValues.background$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void background$set(MemorySegment seg, long index, long x) {
        XGCValues.background$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle line_width$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("line_width"));
    public static VarHandle line_width$VH() {
        return XGCValues.line_width$VH;
    }
    public static int line_width$get(MemorySegment seg) {
        return (int)XGCValues.line_width$VH.get(seg);
    }
    public static void line_width$set( MemorySegment seg, int x) {
        XGCValues.line_width$VH.set(seg, x);
    }
    public static int line_width$get(MemorySegment seg, long index) {
        return (int)XGCValues.line_width$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void line_width$set(MemorySegment seg, long index, int x) {
        XGCValues.line_width$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle line_style$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("line_style"));
    public static VarHandle line_style$VH() {
        return XGCValues.line_style$VH;
    }
    public static int line_style$get(MemorySegment seg) {
        return (int)XGCValues.line_style$VH.get(seg);
    }
    public static void line_style$set( MemorySegment seg, int x) {
        XGCValues.line_style$VH.set(seg, x);
    }
    public static int line_style$get(MemorySegment seg, long index) {
        return (int)XGCValues.line_style$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void line_style$set(MemorySegment seg, long index, int x) {
        XGCValues.line_style$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle cap_style$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cap_style"));
    public static VarHandle cap_style$VH() {
        return XGCValues.cap_style$VH;
    }
    public static int cap_style$get(MemorySegment seg) {
        return (int)XGCValues.cap_style$VH.get(seg);
    }
    public static void cap_style$set( MemorySegment seg, int x) {
        XGCValues.cap_style$VH.set(seg, x);
    }
    public static int cap_style$get(MemorySegment seg, long index) {
        return (int)XGCValues.cap_style$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cap_style$set(MemorySegment seg, long index, int x) {
        XGCValues.cap_style$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle join_style$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("join_style"));
    public static VarHandle join_style$VH() {
        return XGCValues.join_style$VH;
    }
    public static int join_style$get(MemorySegment seg) {
        return (int)XGCValues.join_style$VH.get(seg);
    }
    public static void join_style$set( MemorySegment seg, int x) {
        XGCValues.join_style$VH.set(seg, x);
    }
    public static int join_style$get(MemorySegment seg, long index) {
        return (int)XGCValues.join_style$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void join_style$set(MemorySegment seg, long index, int x) {
        XGCValues.join_style$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle fill_style$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("fill_style"));
    public static VarHandle fill_style$VH() {
        return XGCValues.fill_style$VH;
    }
    public static int fill_style$get(MemorySegment seg) {
        return (int)XGCValues.fill_style$VH.get(seg);
    }
    public static void fill_style$set( MemorySegment seg, int x) {
        XGCValues.fill_style$VH.set(seg, x);
    }
    public static int fill_style$get(MemorySegment seg, long index) {
        return (int)XGCValues.fill_style$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void fill_style$set(MemorySegment seg, long index, int x) {
        XGCValues.fill_style$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle fill_rule$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("fill_rule"));
    public static VarHandle fill_rule$VH() {
        return XGCValues.fill_rule$VH;
    }
    public static int fill_rule$get(MemorySegment seg) {
        return (int)XGCValues.fill_rule$VH.get(seg);
    }
    public static void fill_rule$set( MemorySegment seg, int x) {
        XGCValues.fill_rule$VH.set(seg, x);
    }
    public static int fill_rule$get(MemorySegment seg, long index) {
        return (int)XGCValues.fill_rule$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void fill_rule$set(MemorySegment seg, long index, int x) {
        XGCValues.fill_rule$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle arc_mode$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("arc_mode"));
    public static VarHandle arc_mode$VH() {
        return XGCValues.arc_mode$VH;
    }
    public static int arc_mode$get(MemorySegment seg) {
        return (int)XGCValues.arc_mode$VH.get(seg);
    }
    public static void arc_mode$set( MemorySegment seg, int x) {
        XGCValues.arc_mode$VH.set(seg, x);
    }
    public static int arc_mode$get(MemorySegment seg, long index) {
        return (int)XGCValues.arc_mode$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void arc_mode$set(MemorySegment seg, long index, int x) {
        XGCValues.arc_mode$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle tile$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("tile"));
    public static VarHandle tile$VH() {
        return XGCValues.tile$VH;
    }
    public static long tile$get(MemorySegment seg) {
        return (long)XGCValues.tile$VH.get(seg);
    }
    public static void tile$set( MemorySegment seg, long x) {
        XGCValues.tile$VH.set(seg, x);
    }
    public static long tile$get(MemorySegment seg, long index) {
        return (long)XGCValues.tile$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void tile$set(MemorySegment seg, long index, long x) {
        XGCValues.tile$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle stipple$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("stipple"));
    public static VarHandle stipple$VH() {
        return XGCValues.stipple$VH;
    }
    public static long stipple$get(MemorySegment seg) {
        return (long)XGCValues.stipple$VH.get(seg);
    }
    public static void stipple$set( MemorySegment seg, long x) {
        XGCValues.stipple$VH.set(seg, x);
    }
    public static long stipple$get(MemorySegment seg, long index) {
        return (long)XGCValues.stipple$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void stipple$set(MemorySegment seg, long index, long x) {
        XGCValues.stipple$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ts_x_origin$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ts_x_origin"));
    public static VarHandle ts_x_origin$VH() {
        return XGCValues.ts_x_origin$VH;
    }
    public static int ts_x_origin$get(MemorySegment seg) {
        return (int)XGCValues.ts_x_origin$VH.get(seg);
    }
    public static void ts_x_origin$set( MemorySegment seg, int x) {
        XGCValues.ts_x_origin$VH.set(seg, x);
    }
    public static int ts_x_origin$get(MemorySegment seg, long index) {
        return (int)XGCValues.ts_x_origin$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ts_x_origin$set(MemorySegment seg, long index, int x) {
        XGCValues.ts_x_origin$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ts_y_origin$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ts_y_origin"));
    public static VarHandle ts_y_origin$VH() {
        return XGCValues.ts_y_origin$VH;
    }
    public static int ts_y_origin$get(MemorySegment seg) {
        return (int)XGCValues.ts_y_origin$VH.get(seg);
    }
    public static void ts_y_origin$set( MemorySegment seg, int x) {
        XGCValues.ts_y_origin$VH.set(seg, x);
    }
    public static int ts_y_origin$get(MemorySegment seg, long index) {
        return (int)XGCValues.ts_y_origin$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ts_y_origin$set(MemorySegment seg, long index, int x) {
        XGCValues.ts_y_origin$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle font$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("font"));
    public static VarHandle font$VH() {
        return XGCValues.font$VH;
    }
    public static long font$get(MemorySegment seg) {
        return (long)XGCValues.font$VH.get(seg);
    }
    public static void font$set( MemorySegment seg, long x) {
        XGCValues.font$VH.set(seg, x);
    }
    public static long font$get(MemorySegment seg, long index) {
        return (long)XGCValues.font$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void font$set(MemorySegment seg, long index, long x) {
        XGCValues.font$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle subwindow_mode$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("subwindow_mode"));
    public static VarHandle subwindow_mode$VH() {
        return XGCValues.subwindow_mode$VH;
    }
    public static int subwindow_mode$get(MemorySegment seg) {
        return (int)XGCValues.subwindow_mode$VH.get(seg);
    }
    public static void subwindow_mode$set( MemorySegment seg, int x) {
        XGCValues.subwindow_mode$VH.set(seg, x);
    }
    public static int subwindow_mode$get(MemorySegment seg, long index) {
        return (int)XGCValues.subwindow_mode$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void subwindow_mode$set(MemorySegment seg, long index, int x) {
        XGCValues.subwindow_mode$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle graphics_exposures$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("graphics_exposures"));
    public static VarHandle graphics_exposures$VH() {
        return XGCValues.graphics_exposures$VH;
    }
    public static int graphics_exposures$get(MemorySegment seg) {
        return (int)XGCValues.graphics_exposures$VH.get(seg);
    }
    public static void graphics_exposures$set( MemorySegment seg, int x) {
        XGCValues.graphics_exposures$VH.set(seg, x);
    }
    public static int graphics_exposures$get(MemorySegment seg, long index) {
        return (int)XGCValues.graphics_exposures$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void graphics_exposures$set(MemorySegment seg, long index, int x) {
        XGCValues.graphics_exposures$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle clip_x_origin$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("clip_x_origin"));
    public static VarHandle clip_x_origin$VH() {
        return XGCValues.clip_x_origin$VH;
    }
    public static int clip_x_origin$get(MemorySegment seg) {
        return (int)XGCValues.clip_x_origin$VH.get(seg);
    }
    public static void clip_x_origin$set( MemorySegment seg, int x) {
        XGCValues.clip_x_origin$VH.set(seg, x);
    }
    public static int clip_x_origin$get(MemorySegment seg, long index) {
        return (int)XGCValues.clip_x_origin$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void clip_x_origin$set(MemorySegment seg, long index, int x) {
        XGCValues.clip_x_origin$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle clip_y_origin$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("clip_y_origin"));
    public static VarHandle clip_y_origin$VH() {
        return XGCValues.clip_y_origin$VH;
    }
    public static int clip_y_origin$get(MemorySegment seg) {
        return (int)XGCValues.clip_y_origin$VH.get(seg);
    }
    public static void clip_y_origin$set( MemorySegment seg, int x) {
        XGCValues.clip_y_origin$VH.set(seg, x);
    }
    public static int clip_y_origin$get(MemorySegment seg, long index) {
        return (int)XGCValues.clip_y_origin$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void clip_y_origin$set(MemorySegment seg, long index, int x) {
        XGCValues.clip_y_origin$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle clip_mask$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("clip_mask"));
    public static VarHandle clip_mask$VH() {
        return XGCValues.clip_mask$VH;
    }
    public static long clip_mask$get(MemorySegment seg) {
        return (long)XGCValues.clip_mask$VH.get(seg);
    }
    public static void clip_mask$set( MemorySegment seg, long x) {
        XGCValues.clip_mask$VH.set(seg, x);
    }
    public static long clip_mask$get(MemorySegment seg, long index) {
        return (long)XGCValues.clip_mask$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void clip_mask$set(MemorySegment seg, long index, long x) {
        XGCValues.clip_mask$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dash_offset$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dash_offset"));
    public static VarHandle dash_offset$VH() {
        return XGCValues.dash_offset$VH;
    }
    public static int dash_offset$get(MemorySegment seg) {
        return (int)XGCValues.dash_offset$VH.get(seg);
    }
    public static void dash_offset$set( MemorySegment seg, int x) {
        XGCValues.dash_offset$VH.set(seg, x);
    }
    public static int dash_offset$get(MemorySegment seg, long index) {
        return (int)XGCValues.dash_offset$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dash_offset$set(MemorySegment seg, long index, int x) {
        XGCValues.dash_offset$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dashes$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dashes"));
    public static VarHandle dashes$VH() {
        return XGCValues.dashes$VH;
    }
    public static byte dashes$get(MemorySegment seg) {
        return (byte)XGCValues.dashes$VH.get(seg);
    }
    public static void dashes$set( MemorySegment seg, byte x) {
        XGCValues.dashes$VH.set(seg, x);
    }
    public static byte dashes$get(MemorySegment seg, long index) {
        return (byte)XGCValues.dashes$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dashes$set(MemorySegment seg, long index, byte x) {
        XGCValues.dashes$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment allocate(ResourceScope scope) { return allocate(SegmentAllocator.nativeAllocator(scope)); }
    public static MemorySegment allocateArray(int len, ResourceScope scope) {
        return allocateArray(len, SegmentAllocator.nativeAllocator(scope));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, ResourceScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


